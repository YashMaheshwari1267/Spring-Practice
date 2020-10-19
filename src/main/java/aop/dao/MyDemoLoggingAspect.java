package aop.dao;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// @Before("execution(public void addAccount())")

	// @Before("execution(public void add*())")

	@Before("execution(* add*(..))")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
		System.out.println("\n Adding @Before Advice");

		MethodSignature methoSig = (MethodSignature) joinPoint.getSignature();
		System.out.println("Method: " + methoSig);

		Object[] args = joinPoint.getArgs();

		for (Object obj : args) {
			System.out.println("Arg: " + obj);
		}
	}

	@AfterReturning(pointcut = "execution(* findAccounts(..))", returning = "result")
	public void afterReturningFindAccountsAdvice(JoinPoint joinPoint, List<Account> result) {
		String method = joinPoint.getSignature().toShortString();
		System.out.println(method);
		System.out.println("Executing @AfterReturning Advice...");
		System.out.println("Result" + result);
	}

	@AfterThrowing(pointcut = "execution(* findAccounts(..))", throwing = "theExc")
	public void afterThrowingFindAccountsAdvice(JoinPoint joinPoint, Throwable theExc) {
		System.out.println("Exception is: " + theExc);
	}

	@After("execution(* findAccounts(..))")
	public void afterFinallyFindAccounts(JoinPoint joinPoint) {
		String method = joinPoint.getSignature().toShortString();
		System.out.println("Executing @After on method: " + method);
	}
	
	@Around("execution(* getFortune(..))")
	public Object aroundGetFortune(ProceedingJoinPoint pj, Throwable exec) throws Throwable {
		String method = pj.getSignature().toShortString();
		System.out.println("Executing @Around on method: " + method);
		
		long begin = System.currentTimeMillis();
		
		Object result = pj.proceed();
		
		long end = System.currentTimeMillis();
		
		long duration= end-begin;
		System.out.println("Duration: "+duration/1000+" seconds");
		return result;
	}
	
}

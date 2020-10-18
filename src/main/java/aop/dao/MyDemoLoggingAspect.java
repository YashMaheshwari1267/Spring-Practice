package aop.dao;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	//@Before("execution(public void addAccount())")
	
	//@Before("execution(public void add*())")
	
	@Before("execution(* add*(..))")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {
		System.out.println("\n Adding @Before Advice");
		
		MethodSignature methoSig = (MethodSignature)joinPoint.getSignature();
		System.out.println("Method: " + methoSig);
		
		Object [] args = joinPoint.getArgs();
		
		for(Object obj: args) {
			System.out.println("Arg: "+obj);
		}
	}
}

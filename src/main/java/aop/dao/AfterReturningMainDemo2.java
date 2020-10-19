package aop.dao;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AfterReturningMainDemo2 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		List<Account> theAccounts = theAccountDAO.findAccounts(false);
		
		System.out.println(theAccounts);
		
		context.close();
	}

}

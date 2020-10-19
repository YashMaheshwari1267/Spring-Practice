package aop.dao;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AfterThrowingMainDemo3 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

		List<Account> theAccounts = null;
		try {
			boolean tripWire=true;
			theAccountDAO.findAccounts(tripWire);
		}
		catch (Exception e) {
			System.out.println("caught exception "+e);
		}
		System.out.println(theAccounts);

		context.close();
	}
}

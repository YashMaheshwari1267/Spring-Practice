package aop.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		theAccountDAO.addAccount(1,2);
		
		System.out.println("lets again call it..");
		
		theAccountDAO.addAccount(3,4);
		
		context.close();
	}

}

package aop.dao;
  
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AroundAdviceMainDemo3 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		TrafficFortuneService fortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);

		System.out.println("Calling getFortune");

		String data = fortuneService.getFortune();

		System.out.println("My fortune is: " + data);

		context.close();
	}

}

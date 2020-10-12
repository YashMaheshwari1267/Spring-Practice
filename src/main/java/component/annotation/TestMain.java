package component.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("message-applicationContext.xml");
		MessageService bean = context.getBean("positiveMessageService", MessageService. class);
		
		System.out.println(bean.getMessage());
	}
}
 
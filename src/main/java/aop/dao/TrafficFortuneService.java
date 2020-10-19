package aop.dao;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {

	public String getFortune() {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "Expect heavy traffic this morning...";
	}
}

package spring.config.java;

public class SadFortuneService implements FortuneService{

	public String getDailyFortune() {
		return "Today is a Sad day.!!";
	}

}

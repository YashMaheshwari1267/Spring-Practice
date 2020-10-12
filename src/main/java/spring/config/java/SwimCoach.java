package spring.config.java;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{
	
	@Value("${email}")
	private String email;
	
	@Value("${team}")
	private String team;
	
	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Swim 1000 meteres as Warm-Up";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}

package autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class CricketCoach implements Coach {
	
	//field Auto-wiring
	@Autowired
	private FortuneService fortuneService;
	
//constructor Auto-wiring

//	@Autowired
//	public CricketCoach(FortuneService fortuneService) {
//		super();
//		this.fortuneService = fortuneService;
//	}
	
//setter Auto-wiring

//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	public String getDailyWorkout() {
		return "Practice bowling for 2 hrs..";
	}

	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}

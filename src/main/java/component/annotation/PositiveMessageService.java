package component.annotation;

import org.springframework.stereotype.Component;

@Component
public class PositiveMessageService implements MessageService {
	
	public String getMessage() {
		return "Keep calm and conqueor the WORLD..!!";
	}

}

package guru.springframework.sfgpi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgpi.services.GreetingService;

@Controller
public class I18GreetingController {
	
	private GreetingService greetingService;

	public I18GreetingController(
			@Qualifier("I18Service")
			GreetingService greetingService) {
		
		this.greetingService = greetingService;
	}
	
	public String greeting() {
		return greetingService.sayHello();
	}

}

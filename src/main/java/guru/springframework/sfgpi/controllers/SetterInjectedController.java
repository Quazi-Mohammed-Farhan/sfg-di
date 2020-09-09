package guru.springframework.sfgpi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgpi.services.GreetingService;

@Controller
public class SetterInjectedController {

	private GreetingService greetingService;
	
	public String greeting() {
		
		System.out.println("Setter Injected controller");
		return greetingService.sayHello();
	}
	
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

}

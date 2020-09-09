package guru.springframework.sfgpi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgpi.services.GreetingService;

@Controller
public class MyController {

	private GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String greeting() {
		
		System.out.println("Greeting controller");
		return greetingService.sayHello();
	}
}

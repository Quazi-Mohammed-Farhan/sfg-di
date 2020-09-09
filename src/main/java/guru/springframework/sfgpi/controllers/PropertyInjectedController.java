package guru.springframework.sfgpi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgpi.services.GreetingService;

@Controller
public class PropertyInjectedController {

	public GreetingService greetingService;
	
	public String greeting() {
		
		System.out.println("Property Injected controller");
		return greetingService.sayHello();
	}
}

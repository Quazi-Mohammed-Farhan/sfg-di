package guru.springframework.sfgpi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgpi.services.GreetingService;

@Controller
public class PropertyInjectedController {

	@Qualifier("propertyGreetingServiceImpl")
	@Autowired
	public GreetingService greetingService;
	
	public String greeting() {
		
		System.out.println("Property Injected controller");
		return greetingService.sayHello();
	}
}

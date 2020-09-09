package guru.springframework.sfgpi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgpi.services.GreetingService;

@Controller
public class ConstructorInjectedController {

	private final GreetingService greetingService;
	
	
	//Applying @Autowired annotation is optional for constructor injection
	public ConstructorInjectedController(
			@Qualifier("constructorGreetingServiceImpl")
			GreetingService greetingService) {
		
		this.greetingService = greetingService;
	}
	
	public String greeting() {
		
		System.out.println("Constructor Injected controller");
		return greetingService.sayHello();
	}
}

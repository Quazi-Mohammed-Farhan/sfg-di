package guru.springframework.sfgpi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	
	public String greeting() {
		
		System.out.println("Greeting controller");
		return "Say Hello";
	}
}

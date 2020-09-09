package guru.springframework.sfgpi.controllers;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpi.services.GreetingServiceImpl;

class PropertyInjectedControllerTest {

	PropertyInjectedController propertyInjectedController;
	
	@BeforeEach
	void setUp() throws Exception {
		propertyInjectedController = new PropertyInjectedController();
		propertyInjectedController.greetingService = new GreetingServiceImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		propertyInjectedController.greetingService = null;
		propertyInjectedController = null;
	}

	@Test
	void test() {
		System.out.println(propertyInjectedController.greeting());
	}

}

package guru.springframework.sfgpi.controllers;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpi.services.ConstructorGreetingServiceImpl;

class SetterInjectedControllerTest {

	SetterInjectedController setterInjectedController;
	
	@BeforeEach
	void setUp() throws Exception {
		setterInjectedController = new SetterInjectedController();
		setterInjectedController.setGreetingService(new ConstructorGreetingServiceImpl());
	}

	@AfterEach
	void tearDown() throws Exception {
		setterInjectedController.setGreetingService(null);
		setterInjectedController = null;
	}

	@Test
	void test() {
		System.out.println(setterInjectedController.greeting());
	}

}

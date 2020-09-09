package guru.springframework.sfgpi.controllers;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgpi.services.ConstructorGreetingServiceImpl;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController constructorInjectedController;
	
	@BeforeEach
	void setUp() throws Exception {
		constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingServiceImpl());
	}

	@AfterEach
	void tearDown() throws Exception {
		constructorInjectedController = null;
	}

	@Test
	void test() {
		System.out.println(constructorInjectedController.greeting());
	}

}

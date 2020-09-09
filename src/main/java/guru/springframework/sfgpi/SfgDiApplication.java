package guru.springframework.sfgpi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgpi.controllers.ConstructorInjectedController;
import guru.springframework.sfgpi.controllers.MyController;
import guru.springframework.sfgpi.controllers.PropertyInjectedController;
import guru.springframework.sfgpi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = ctx.getBean("myController", MyController.class);
		System.out.println(myController.greeting());
	
	
		System.out.println("--------- Property Injected Controller ---------");
		
		PropertyInjectedController  propertyInjectedController = 
				ctx.getBean("propertyInjectedController", PropertyInjectedController.class);
		
		System.out.println(propertyInjectedController.greeting());
		
		System.out.println("---------Setter Method Injected Controller ---------");
		
		SetterInjectedController  setterInjectedController = 
				ctx.getBean("setterInjectedController", SetterInjectedController.class);
		
		System.out.println(setterInjectedController.greeting());
		
		System.out.println("---------Constructor Injected Controller ---------");
		
		ConstructorInjectedController  constructorInjectedController = 
				ctx.getBean("constructorInjectedController", ConstructorInjectedController.class);
		
		System.out.println(constructorInjectedController.greeting());
		
		
		System.out.println("--------- ---------");
	
	}

}

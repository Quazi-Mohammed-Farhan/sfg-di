package guru.springframework.sfgpi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

	@Override
	public String sayHello() {
		return "Say Hello -- Constructor Injection";
	}

}

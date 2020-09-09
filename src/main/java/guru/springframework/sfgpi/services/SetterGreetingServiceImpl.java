package guru.springframework.sfgpi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService {

	@Override
	public String sayHello() {
		return "Say Hello -- Setter Method Injection";
	}

}

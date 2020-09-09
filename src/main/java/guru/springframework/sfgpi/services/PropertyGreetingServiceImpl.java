package guru.springframework.sfgpi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {

	@Override
	public String sayHello() {
		return "Say Hello -- Property Injection";
	}

}

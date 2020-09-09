package guru.springframework.sfgpi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrmaryGreetingServiceImpl implements GreetingService {

	@Override
	public String sayHello() {
		return "Say Hello -- Primary Injection";
	}

}

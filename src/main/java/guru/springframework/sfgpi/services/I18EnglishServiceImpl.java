package guru.springframework.sfgpi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(value = {"EN"})
@Service("I18Service")
public class I18EnglishServiceImpl implements GreetingService {

	@Override
	public String sayHello() {
		return "Hello World -- EN";
	}
}

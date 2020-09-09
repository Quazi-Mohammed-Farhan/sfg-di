package guru.springframework.sfgpi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile(value = {"ES", "default"})
@Service("I18Service")
public class I18SpanishServiceImpl implements GreetingService {

	@Override
	public String sayHello() {
		return "Hola Mundo -- ES";
	}
}

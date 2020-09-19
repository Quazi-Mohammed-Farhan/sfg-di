package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanPostProcessorDemo implements BeanPostProcessor {

	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		
		if(bean instanceof LifeCycleDemoBean) {
			((LifeCycleDemoBean)bean).beforeInit();
		}
		
		return bean;
	}
	
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) {

		if(bean instanceof LifeCycleDemoBean) {
			((LifeCycleDemoBean)bean).afterInit();
		}
		
		return bean;
	}
	
}

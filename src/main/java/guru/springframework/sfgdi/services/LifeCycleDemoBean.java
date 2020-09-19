package guru.springframework.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, 
	BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// ApplicationContextAware
		System.out.println("ApplicationContextAware.setBeanNameAware(ApplicationContext appCtz): " + "");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// BeanFactoryAware
		System.out.println("BeanFactoryAware.setBeanFactory(BeanFactory beanFactory)" + "");
	}

	@Override
	public void setBeanName(String name) {
		// BeanNameAware
		System.out.println("BeanNameAware.setBeanName(String beanName) :- " + name);
	}

	@Override
	public void destroy() throws Exception {
		// DisposableBean
		System.out.println("DisposableBean.destroy()" + "");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		//InitialzingBean
		System.out.println("InitializingBean.afterPropertiesSet()" + "");
	}
	
	
	public void beforeInit() {
		System.out.println("LifeCycleDemoBea.beforInit()" + this);
	}
	
	
	public void afterInit() {
		System.out.println("LifeCycleDemonBea.afterInit()" + this);
	}

}

package com.spring_ioc_container_constructor_injector;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Mouse_Driver {

	public static void main(String[] args) {
		
//		 J2EE CONTAINER
//		ApplicationContext context = new ClassPathXmlApplicationContext("mouse.xml");
//	    Mouse mouse = (Mouse)context.getBean("mymouse");
//	    mouse.getMouseDetails();
		
//		CORE CONTAINER
		Resource resource = new ClassPathResource("mouse.xml");
	    BeanFactory bean = new XmlBeanFactory(resource);
	     
	    Mouse mouse = (Mouse) bean.getBean("mymouse");
	    mouse.getMouseDetails();
	}
}

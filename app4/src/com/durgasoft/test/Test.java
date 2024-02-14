package com.durgasoft.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.durgasoft.beans.WelcomeBean;

public class Test {

	public static void main(String[] args) throws Exception {

		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		WelcomeBean bean1 = (WelcomeBean) factory.getBean("welcomeBean");
		WelcomeBean bean2 = (WelcomeBean) factory.getBean("welcomeBean");
		WelcomeBean bean3 = (WelcomeBean) factory.getBean("welcomeBean");
		
		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean3);
		
		//String message = bean.wish();
		//System.out.println(message);
	}

}

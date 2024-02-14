package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.HelloBean;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext context =new ClassPathXmlApplicationContext("spring_config.xml");
		HelloBean bean = (HelloBean) context.getBean("helloBean");
	//	bean.setName("vilas");
		String message = bean.sayhelloBean();
		
		System.out.println(message);
		
		
	}
	
}

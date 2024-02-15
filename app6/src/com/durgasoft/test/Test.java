package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.durgasoft.beans.HelloBean;
import com.durgasoft.beans.WelcomeBean;
import com.durgasoft.config.BeanConfig;

public class Test {
	public static void main(String[] args) {
         ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
         HelloBean bean1=(HelloBean) context.getBean("helloBean");
         System.out.println(bean1.sayHelloBean());
         
         System.out.println("=======================================");
         
         WelcomeBean bean2=(WelcomeBean) context.getBean("welcomeBean");
         System.out.println(bean2.sayWelcome());
         
	}

}

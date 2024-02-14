package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.EmployeeBean;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml");
	//	EmployeeBean bean=(EmployeeBean) context.getBean("empBean");
	//	bean.displayEmployeeDetails();
 		EmployeeBean empBean1=(EmployeeBean) context1.getBean("empBean");
 		EmployeeBean empBean2=(EmployeeBean) context1.getBean("empBean");
 		EmployeeBean empBean3=(EmployeeBean) context1.getBean("empBean");
 		System.out.println(empBean1);
 		System.out.println(empBean2);
 		System.out.println(empBean3);
 		
 		
 		System.out.println("====================================================");
 		ApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext.xml");
 		//	EmployeeBean bean=(EmployeeBean) context.getBean("empBean");
 		//	bean.displayEmployeeDetails();
 	 		EmployeeBean empBean4=(EmployeeBean) context2.getBean("empBean");
 	 		EmployeeBean empBean5=(EmployeeBean) context2.getBean("empBean");
 	 		EmployeeBean empBean6=(EmployeeBean) context2.getBean("empBean");
 	 		System.out.println(empBean4);
 	 		System.out.println(empBean5);
 	 		System.out.println(empBean6);
 	 		
 		
 		
	}

}

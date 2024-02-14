package com.durgasoft.beans;

public class WelcomeBean {

	static {
		System.out.println("Bean class Loading");
	}

	public WelcomeBean() {
		System.out.println("Bean class Object creating ...");
	}

	public String wish() {
		return "Welcome to Durga soft solution";
	}
}

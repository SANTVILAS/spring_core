package com.durgasoft.beans;

public class HelloBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String sayhelloBean() {
		return "Hello User! "+name+"!";
	}

}

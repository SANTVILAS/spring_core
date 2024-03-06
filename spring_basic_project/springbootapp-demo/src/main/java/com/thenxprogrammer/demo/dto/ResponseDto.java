package com.thenxprogrammer.demo.dto;

import org.springframework.http.HttpStatus;

public class ResponseDto {

	private Object messgae;
	private int status;
	
	
	
	public ResponseDto() {
		super();
	}
	public ResponseDto(Object messgae, int status) {
		super();
		this.messgae = messgae;
		this.status = status;
	}
	public Object getMessgae() {
		return messgae;
	}
	public void setMessgae(Object messgae) {
		this.messgae = messgae;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ResponseDto [messgae=" + messgae + ", status=" + status + "]";
	}
	
	
	
}

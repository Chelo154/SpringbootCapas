package com.capas.infra.springboot.responses;

public class OkResponse {

	private String message;
	
	public OkResponse() {
		
	}
	
	public OkResponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}

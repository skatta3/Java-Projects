package com.training.server.main.schemaObjs;

public class DefaultResponse {
	String message = "Success";
	String errorCode = "200";
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

}

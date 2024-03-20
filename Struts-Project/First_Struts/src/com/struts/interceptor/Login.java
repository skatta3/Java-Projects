package com.struts.interceptor;

public class Login {
	private String name,password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute(){
		System.out.println("Password:" + password);
		try{Thread.sleep(2000);}catch(Exception e){}
		if(password.equals("admin")){
			return "success";
		}
		else
			return "error";
	}
}

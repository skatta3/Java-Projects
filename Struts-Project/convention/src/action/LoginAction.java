package action;

public class LoginAction {
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
	if(password.equals("struts")){
		return "success";
	}
	else
		return "error";
}
}

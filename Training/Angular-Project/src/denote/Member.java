package denote;

public class Member {

	private String name, password, email, phoneno;
	public Member() {
		super();
	}

	public Member(String name, String password, String email, String phone) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.phoneno = phone;
	}

	public String getname() {
	return name;
	}
	
	public void setname(String uname) {
	this.name = uname;
	}
	
	public String getpassword() {
	return password;
	}
	
	public void setpassword(String password) {
	this.password = password;
	}
	
	public String getemail() {
	return email;
	}
	
	public void setemail(String email) {
	this.email = email;
	}
	
	public String getphoneno() {
	return phoneno;
	}
	
	public void setphone(String phoneno) {
	this.phoneno = phoneno;
	}



}
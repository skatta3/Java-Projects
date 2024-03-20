package mypack;

import org.apache.struts2.convention.annotation.*;

@Action(value="login",
		results={
		@Result(name="success",location="/myResults/result.jsp")
		})

	public class MyAction {
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String execute()
	{
	return "success";	
	}
}

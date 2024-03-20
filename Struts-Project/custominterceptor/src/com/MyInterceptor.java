package com;

import org.omg.CORBA.Context;
import org.omg.CORBA.ContextList;
import org.omg.CORBA.DomainManager;
import org.omg.CORBA.ExceptionList;
import org.omg.CORBA.NVList;
import org.omg.CORBA.NamedValue;
import org.omg.CORBA.Object;
import org.omg.CORBA.Policy;
import org.omg.CORBA.Request;
import org.omg.CORBA.SetOverrideType;
import org.omg.PortableInterceptor.Interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.util.ValueStack;

public abstract class MyInterceptor implements Interceptor{   
	
	public void init() {}  
	public String intercept(ActionInvocation ai) throws Exception {  
	    ValueStack stack=ai.getStack();  
	    String s=stack.findString("name");  
	      
	    stack.set("name",s.toUpperCase());  
	    return ai.invoke();  
	}  
	public void destroy() {}
}

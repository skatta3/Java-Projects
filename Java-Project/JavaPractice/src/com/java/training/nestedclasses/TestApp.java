package com.java.training.nestedclasses;

import com.java.training.nestedclasses.MemberInnerClass.Inner;

public class TestApp {

	  public static void main(String args [] )
	    {
	    	MemberInnerClass o = new MemberInnerClass();
	    	MemberInnerClass.Inner i = o.new Inner();
	        i.print();
	        
	        System.out.println(o.data);
	    }
}

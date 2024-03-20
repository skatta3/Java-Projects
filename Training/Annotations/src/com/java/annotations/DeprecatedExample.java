package com.java.annotations;

class A{  
	void m(){
		System.out.println("hello m");
	}  
  
	@Deprecated  
	void n(){
		System.out.println("hello n");
	}  
}  
  
class DeprecatedExample{  
	public static void main(String args[]){   
		A a=new A();  
		a.n();  
	}
}  
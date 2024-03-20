package com.java.typecasting;

public class NarrowingTypeCasting  
{  
	public static void main(String args[])  
	{  
		double d = 166.66;  
		//converting double data type into long data type  
		long l = (long)d;  
		//converting long data type into int data type  
		int i = (int)l;  
		
		byte b = (byte) i;
		System.out.println("Before conversion: "+d);  
		//fractional part lost  
		System.out.println("After conversion into long type: "+l);  
		//fractional part lost  
		System.out.println("After conversion into int type: "+i);  
		
		System.out.println("After conversion into byte type: "+b);  
		
		
	}  
}  
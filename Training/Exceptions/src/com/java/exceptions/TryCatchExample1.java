package com.java.exceptions;

// Problem without exception handling
//public class TryCatchExample1 {
//	public static void main(String[] args) {  
//        
//        int data=50/0; //may throw exception   
//          
//        System.out.println("rest of the code");  
//          
//    }  
//}
/** As displayed in the above example, the rest of the code is not executed (in such 
 * case, the rest of the code statement is not printed).
 *  There can be 100 lines of code after exception. So all the code after exception will 
 *  not be executed
 *  
 */

//Solution by Exception Handling
public class TryCatchExample1 {
	public static void main(String[] args) {  
	    try  
	    {  
	    int data=50/0; //may throw exception   
	    }  
	        //handling the exception  
	    catch(Exception e)  
	    {  
	        System.out.println(e);  
	    }  
	    System.out.println("rest of the code");  
	}  
}
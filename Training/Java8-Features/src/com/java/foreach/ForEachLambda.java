package com.java.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;  
public class ForEachLambda{  
    public static void main(String[] args) {       
       List<String> list=new ArrayList<String>();  
       list.add("Rick");         
       list.add("Negan");       
       list.add("Daryl");         
       list.add("Glenn");         
       list.add("Carl");   
       
//       list.forEach(          
//           (names)->System.out.println(names)         
//       );     
       
//       for(String x : list) {  //Enhanced/Advanced For Loop
//    	   System.out.println(x);
//       }
       
       list.forEach(new Consumer<String>() {

		@Override
		public void accept(String t)
		{

			System.out.println(t);
		}

	});
    }  
}
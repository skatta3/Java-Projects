package com.java.arraylist;

import java.util.*;  
// Traverse the ArrayList elements through other ways
public class ListIteratorExample{  
 public static void main(String args[]){  
	ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
	    
	   list.add("Ravi");//Adding object in arraylist  
	   list.add("Vijay");  
	   list.add("Ravi");  
	   list.add("Ajay");  
            mkdir
       System.out.println("Traversing list through List Iterator in Backward direction:");  
       //Here, element iterates in reverse order  
          ListIterator<String> list1 = list.listIterator(list.size());  
          while(list1.hasPrevious())  
          {  
              System.out.println(list1.previous());  
          }  
          System.out.println("Traversing list through List Iterator in Forward direction:");           
          ListIterator<String> list2 = list.listIterator();  
          while(list2.hasNext())  
          {  
              String str=list2.next();  
              System.out.println(list2.next());  
          }  
          System.out.println("Complete");
          
//        System.out.println("Traversing list through for loop:");  
//           for(int i=0;i<list.size();i++)  
//           {  
//            System.out.println(list.get(i));     
//           }  
//              
//        System.out.println("Traversing list through forEach() method:");  
//        //The forEach() method is a new feature, introduced in Java 8.  
//            list.forEach(a->{ //Here, we are using lambda expression  
//                System.out.println(a);  
//              });  
//                
//        System.out.println("Traversing list through forEachRemaining() method:");  
//          Iterator<String> itr=list.iterator();  
//          itr.forEachRemaining(a-> //Here, we are using lambda expression  
//          {  
//        System.out.println(a);  
//          });  
 }  
}  
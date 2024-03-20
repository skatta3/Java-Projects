package com.java.training.Casting;

class Test 
{ 
    public static void main(String[] args) 
    { 
        double d = 100;  
          
        //explicit type casting 
        long l = (long)d; 
        float la = (float)d; 
          
        //explicit type casting  
        int i = (int)l;  
        System.out.println("Double value "+d); 
          
        //fractional part lost 
        System.out.println("Long value "+l);  
        System.out.println("Long value "+la);  
          
        //fractional part lost 
        System.out.println("Int value "+i);  
    }  

} 

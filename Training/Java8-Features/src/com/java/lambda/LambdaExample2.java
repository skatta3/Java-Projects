package com.java.lambda;

interface StringConcat {
    public String sconcat(String a, String b);
}
public class LambdaExample2 {

   public static void main(String args[]) {
        // lambda expression with multiple arguments
    	StringConcat s = (str1, str2) -> str1 + str2;
        System.out.println("Result: "+s.sconcat("Hello ", "World"));
    }
}
package com.java.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class CreateTreeSet {
    public static void main(String[] args) {
         /*
            The above TreeSet with the custom Comparator is the concise form of the following:        */ 
            SortedSet<String> fruits = new TreeSet<>(new Comparator<String>() {
                @Override
                public int compare(String s1, String s2) {
                    return s1.compareTo(s2);
                }
            });
 
        
        // Adding new elements to a TreeSet
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println("Fruits Set : " + fruits);

        // Duplicate elements are ignored
        fruits.add("Apple");
        System.out.println("After adding duplicate element \"Apple\" : " + fruits);

        // This will be allowed because it's in lowercase.
        fruits.add("banana");
        System.out.println("After adding \"banana\" : " + fruits);
        
     // Finding the size of a TreeSet
        System.out.println("Number of elements in the TreeSet : " + fruits.size());

        // Check if an element exists in the TreeSet
        String name = "Orange";
        if(fruits.contains(name)) {
            System.out.println("TreeSet contains the element : " + name);
        } else {
            System.out.println("TreeSet does not contain the element : " + name);
        }

        // Navigating through the TreeSet
        System.out.println("First element : " + fruits.first());
        System.out.println("Last element : " + fruits.last());        
    }
}

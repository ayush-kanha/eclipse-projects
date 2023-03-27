package com.practice;


// Java Program to Convert a List to an array
// using toArray() Within a loop
 
// Importing utility classes
import java.util.*;
 
// Main class
public class GFG {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating an empty LinkedList of string type
        // by declaring object of List
    	List<String> list = new LinkedList<String>();
 
        // Adding elements to above LinkedList
        // using add() method
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("Practice");
 
        // Converting List to array
        // using toArray() method
       Object[] arr = list.toArray();
 
        // Printing elements of array
        // using for-each loop
        for (Object x : arr)
            System.out.print(x+ " ");
    }
}
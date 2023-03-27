package com.practice;
import java.io.*;
import java.util.Scanner;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source 
{
    public static void main(String[] args)
     {
    	System.out.println("hi");
         Scanner sc = new Scanner(System.in);
         int size = sc.nextInt(); 
         int sum=0;
         int higest=0;
         int[] arr = new int[size];
         for(int i=0;i<size;i++)
         {
             arr[i] = sc.nextInt();
         }  

         for(int i=0;i<size;i++)
         {
            sum+=arr[i];
            if(sum>higest)
                higest=sum;
            if(sum<0)
                sum=0;
         }

         System.out.println(higest);
     }
}

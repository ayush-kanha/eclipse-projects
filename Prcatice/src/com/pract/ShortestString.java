package com.pract;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ShortestString 
{

	 public static String MinWindowSubstring(String[] strArr) 
	 {
		    
		 	String str1 = strArr[0].toLowerCase();  //ayush
		 	String str2 = strArr[1].toLowerCase(); // uh
		 	boolean regex = false;
		 	String substr ="";
		 	char[] ch2 = str2.toCharArray();
		 	Arrays.sort(ch2);
		 	int length2 = str2.length();
		 	
		 	for(int i=0;i<strArr.length;i++)
		 	{
		 		for(int j=i+1;j<strArr.length;j++)
		 		{
		 			substr = str1.substring(i,j+1);
		 			int length_sub = substr.length();
		 			char[] ch = substr.toCharArray();
		 			Arrays.sort(ch);
 		 			//boolean hasChar = false;
		
		 			if(length_sub>=length2)
		 			{
		 				regex = Pattern.matches(ch.toString(), ch2.toString());	
		 				if(regex==true)
		 					break;
		 			}
		 			
		 		}
		 	}

		    return substr;
		  }

		  public static void main (String[] args) {  
		    // keep this function call here     
		    Scanner s = new Scanner(System.in);
		    String[] str = new String[2];
		    System.out.println("give array value: ");
		    str[0] = s.nextLine();
		    str[1] = s.next();
		    System.out.print(MinWindowSubstring(str));
		  }


}




//for(int x=0;x<length_sub;x++)
//	{
//		for(int y=x+1;y<length_sub;y++)
//		{
//			boolean regex = Pattern.matches(str2, ch2.toString());
//		}






//
//import java.util.*; 
//import java.io.*;
//
//class Main {
//
//  public static String MinWindowSubstring(String[] strArr) {
//
//    char[] ch1= strArr[0].toLowerCase().toString().toCharArray();
//    
//    //List<String> list = Arrays.asList(first);
//    char[] ch2= strArr[1].toLowerCase().toString().toCharArray();
//    char temp ;
//
//    for(int i=0;i<ch2.length-1;i++)
//    {
//      if(ch2[i]>ch2[i+1])
//      {
//        temp=ch2[i+1];
//        ch2[i+1]=ch2[i];
//        ch2[i]=temp;
//      }
//    }
//
//
//    String shortest = ch1.toString();
//
//    for(int i=0;i<ch1.length;i++)
//    {
//      for(int j=i+1;j<ch1.length;j++)
//      {
//        String substr = ch1.toString().substring(i,j);
//         char[] ch3 = substr.toCharArray();
//        for(int k=0;k<ch3.length-1;k++)
//        {
//          if(ch3[k]>ch3[k+1])
//          {
//            temp=ch3[k+1];
//            ch3[k+1]=ch3[k];
//            ch3[k]=temp;
//          }
//        }
//
//        if(ch2.equals(ch3))
//        {
//          shortest=ch3.toString();
//        }
//      }
//
//    }
//
//    return shortest;
//  }
//
//  public static void main (String[] args) {  
//    // keep this function call here     
//    Scanner s = new Scanner(System.in);
//    System.out.print(MinWindowSubstring(s.nextLine())); 
//  }
//
//}
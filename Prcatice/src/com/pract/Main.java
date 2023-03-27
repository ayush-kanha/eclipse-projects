package com.pract;

import java.util.*; 
import java.io.*;

class Main {

  public static String LongestWord(String sen) 
  {
	 String str = sen.toLowerCase();
	 int position=0;
	 int j=0;
	 String longest="";
	 
	 String[] temp= new String[str.length()];
	 for(int i=0;i<str.length();i++)
	 {
		 if(str.charAt(i)==' ')
		 {	
			 temp[j]=str.substring(position,i);
			 if(temp[j].length()>longest.length())
				 longest=temp[j];
			 position=i+1;
			 j++;
		 }
		 if(i==str.length()-1)
		 {
			 temp[j]=str.substring(position,str.length());
			 if(temp[j].length()>longest.length())
				 longest=temp[j];
		 }
	 }
    return longest;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.println("Give String : ");
    System.out.print(LongestWord(s.nextLine())); 
  }

}


//System.out.println(temp.length);
// System.out.println(temp[0].length());
//
//for(int i=0;i<space;i++)
//{
//
////System.out.println(temp[i]);
//
//longestLength=temp[i].length();
//
//System.out.println("length of temp"+temp[i]+ ":"+temp[i].length());
//}


//for(int k=i+1;k<=i+1;k++)
//{
//	 System.out.println("length = "+temp[k]);
//	 if(temp[i].length()<temp[k].length())
//		 longest=temp[k];
//}
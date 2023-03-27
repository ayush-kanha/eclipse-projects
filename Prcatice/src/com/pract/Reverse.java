package com.pract;


import java.util.*;
import java.util.regex.Pattern;
import java.io.*;
class Reverse {

	  public static String QuestionsMarks(String str) {
	    String substr ="";
			int count=0;
			String isValid="false";
			for(int i=0;i<str.length();i++)
			{
				for(int j=i+1;j<str.length();j++)
				{
					substr = str.substring(i,j+1);
					int length = substr.length();
					boolean regex = Pattern.matches("[0-9][A-Za-z//?]*[0-9]", substr);
					int a = Character.getNumericValue(substr.charAt(0));
					int b = Character.getNumericValue(substr.charAt(length-1));
					int c = a+b;
					if(length>=5 && regex==true && c==10)
					{
						for(int k=0;k<length;k++)
						{
							if(substr.charAt(k)=='?')
								count++;						
						}
						
						
						if(c==10 && count==3)
						{
							 return "true";
						}
						else
							isValid="false";
					}
				}
			}
			return isValid;
	  }

	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(QuestionsMarks(s.nextLine())); 
	  }

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main (String[] args) {
//	    Scanner sc = new Scanner(System.in);
//	    System.out.println("give string: ");
//	    String str=sc.next();
//		String substr ="";
//		int count=0;
//		
//		for(int i=0;i<str.length();i++)
//		{
//			for(int j=i+1;j<str.length();j++)
//			{
//				substr = str.substring(i,j+1);
//				int length = substr.length();
//				boolean regex = Pattern.matches("[0-9][A-Za-z//?]*[0-9]", substr);
//				int a = Character.getNumericValue(substr.charAt(0));
//				int b = Character.getNumericValue(substr.charAt(length-1));
//				int c = a+b;
//				if(length>=5 && regex==true && c==10)
//				{
//					for(int k=0;k<length;k++)
//					{
//						if(substr.charAt(k)=='?')
//							count++;						
//					}
//					
//					
//					if(c==10 && count==3)
//					{
//						 System.out.println("true");
//					}
//					else
//						System.out.println("false");
//				}
//			}
//		}
//		
//		
//	  }

//	  public static void main (String[] args) {  
//	    // keep this function call here     
//	    Scanner s = new Scanner(System.in);
//	    ;
//	    System.out.print(QuestionsMarks(s.nextLine())); 
//	  }

package com.practice;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

@FunctionalInterface
interface A
{
	void add(int a);
	//void sub();
}

public class Prcatice {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		String s = "Hello";
		StringBuffer str = new StringBuffer(s);
		
		char[] ch  = new char[s.length()];
		
		for(int i=0;i<s.length();i++)
		{
			ch[i] = s.charAt(i);
		}
		
		for(char c:ch)
			{
				System.out.print(c);
			}
		

		
		
		
		
//		int r,sum=0,temp;    
//		  int n=454;//It is the number variable to be checked for palindrome  
//		  
//		  temp=n;    
//		  while(n>0){    
//		   r=n%10;  //getting remainder  
//		   sum=(sum*10)+r;    
//		   System.out.println("sum= "+sum);
//		   n=n/10;
//		   System.out.println("n= "+n);
//		  }    
//		  if(temp==sum)    
//		   System.out.println("palindrome number ");    
//		  else    
//		   System.out.println("not palindrome");  
		
		
		
		
		
		
		
//		A a = (b) ->System.out.println("This is functional interface...");
//		
//		a.add(5);
//		
//		Date date = new Date(2022, 10, 21);
//		
//		
//		System.out.println("Todays date :"+date.getDate());
//		long time = System.currentTimeMillis() ;
//		System.out.println(time);
//		
//		StringBuffer sb = new StringBuffer("Hello ");
//        sb.insert(1, "Java");
//        // Now original string is changed
//        System.out.println(sb);
		
		/*
		 * ArrayList<Integer> numbers = new ArrayList<Integer>(); numbers.add(5);
		 * numbers.add(9); numbers.add(8); numbers.add(1); Consumer<Integer> method =
		 * (n) -> { System.out.println(n); }; numbers.forEach( method );
		 */
	}

}

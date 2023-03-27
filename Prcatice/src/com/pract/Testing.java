package com.pract;

import java.util.Arrays;
import java.util.List;

public class Testing 
{

	public static void main(String[] args) 
	{
//		String[] arr = {"a","b"};
//		
//		
//		List<String> list = Arrays.asList(arr);
//		
//		System.out.println(list);
		
		
		String[] names = {"rohit sharma","Ayush Gupta","Kanha Gupta"};
		
		int size = names.length;
		System.out.println("size:"+size);
		
		String surName = "Gupta";		
		int sSize = surName.length();
		System.out.println("surname:"+sSize);
		
		
		for(int i=0;i<size;i++)
		{
			
			int length = names[i].length();
			System.out.println("length:"+length);
			String substr = names[i].substring(length-sSize);
			
			if(substr.equalsIgnoreCase(surName))
			{
				System.out.println(names[i]);
			}
			
		}
		
		
		
		
	}

}

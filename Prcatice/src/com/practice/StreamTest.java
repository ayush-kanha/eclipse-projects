package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();
		
		int[] a = {1,2,3,4,5};
		
		Integer str;
		
		for(int i=0;i<a.length;i++)
		{
			str=Integer.valueOf(a[i]);
			System.out.println(str+" "+str.getClass());
		}
		
		
		
//		list.add("Ayush");
//		list.add("Kanha");
//		list.add("Babu");
//		
//		
//		List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
//		
////		List<Integer> list1 = listOfStrings.stream().
////				map(Integer::valueOf).collect(Collector.toList());
//		
//		List<Integer> listOfIntegers = listOfStrings.stream()
//		        .map(Integer::valueOf)
//		        .collect(Collectors.toList());
//		 
//		System.out.println(listOfIntegers);
 
	}

}

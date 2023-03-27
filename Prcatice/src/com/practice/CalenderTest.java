package com.practice;

import java.util.*;

public class CalenderTest 
{
	public static void main(String [] rgs)
	{
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.get(Calendar.YEAR));
		
		System.out.println("--------");
		
		ca.setWeekDate(2022, 1, 5);
		
		System.out.println(ca.get(Calendar.DAY_OF_YEAR));
		
	}
}

package com.practice;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeTest 
{
	public static void main(String[] args)
	{
		LocalDate date = LocalDate.of(2021, 10, 2);
		
		System.out.println("Local date is: "+date);
		
		LocalTime time = LocalTime.now();
		System.out.println("cuurent time is :"+time);
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("current date and time is: "+dateTime);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY hh:mm:ss");
		String formattedDateTime = dateTime.format(formatter);
		System.out.println("current date and time in formatter pattern is :"+formattedDateTime);
		
		
	}
	
}

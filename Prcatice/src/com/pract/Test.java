package com.pract;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
//		StringBuffer str = new StringBuffer;
//		str.append("abc");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give number :");
		Long number = sc.nextLong();

		showResult(number);
		//System.out.println(result);

	}

	public static void showResult(Long number) 
	{
		long sum = 0;
		int result = 0;
		String num1 = "" + number;
		if (number > 9) 
		{

			for (int i = 0; i < num1.length(); i++) 
			{
				sum = sum + Character.getNumericValue(num1.charAt(i));
			}

		}

		if (sum > 9)
		{
			showResult(sum);
		}
		else if(sum<9)		
		System.out.println(sum);
		
		else
			System.out.println(sum);
		
	}

}

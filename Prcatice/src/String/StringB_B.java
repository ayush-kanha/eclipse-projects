package String;

import java.util.Arrays;
import java.util.Scanner;

public class StringB_B 
{

	public static void main(String[] args) 
	{				
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.next();
		
		if(s1.equals(s2))
			System.out.println("string is comparing...");
		
		char[] ch1 = s1.toCharArray();
		Arrays.sort(ch1);
		
		StringBuilder sb  = new StringBuilder();
		for(char chr:ch1)
		{
			sb.append(chr);
		}
		
		System.out.println("sorted array 1:"+sb);
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch2);
		//sb.toString();
		StringBuilder sb2  = new StringBuilder();
		for(char chr:ch2)
		{
			sb2.append(chr);
		}
		System.out.println("sorted array 2:"+sb2);
		//sb2.toString();
		if(sb.toString().equalsIgnoreCase(sb2.toString()))
			System.out.println("is anagrams");
		else
			System.out.println("is not anagrams..");
		

 
	}

}

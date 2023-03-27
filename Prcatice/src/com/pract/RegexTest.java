package com.pract;

import java.util.regex.Pattern;

public class RegexTest 
{
	public static void main(String[] args)
	{
	
	String name="9??1";
	String pattern = "[A-Z][a-z]*";
	
	boolean regex = Pattern.matches("[0-9][A-Za-z//?]{2}[0-9]", name);
	System.out.println("regex ="+regex);
	
	System.out.println(Pattern.matches(pattern, name));
	
	
	System.out.println("___________");
	
	char[] ch = {'a','y','u','s','h'};
	char[] ch2 = {'u','h'};
	ch2.toString();
	
	

	//regex = Pattern.matches(ch1, ch2);
	System.out.println("regex = "+regex);
	
	}
}
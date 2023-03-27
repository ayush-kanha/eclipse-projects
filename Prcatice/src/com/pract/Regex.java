package com.pract;
import java.util.regex.Pattern;

class Regex {

  public static void main(String[] strArr) 
  {
	  String str= "hello";
	  
	  Pattern pattern = Pattern.compile(str);
	  boolean matches = pattern.matches("hello this", str);
	  
	  System.out.println(" first match :"+ matches);
	  // [] - this signifies the matching string should be of single character
	  
	 System.out.println(Pattern.matches("[abc]", "ab"));// This only matches single character 
	 													//if more that one ch is there it will return false
	 
	 System.out.println(Pattern.matches("[abc]", "c"));
	 
	 System.out.println(Pattern.matches("[^abc]", "d"));//here also single character.	 
	 
	 System.out.println("-----------");
	 
	 System.out.println(Pattern.matches("[A-Za-z]{5}", "abrfd"));//true
	 
	 
	 // ? this quatifier checks if the given patter is occuring once or zero time if
	 // more than one than it will return false
	 
	 System.out.println(Pattern.matches("[xyz]?","zx")); //false ,occuring more than once
	 
	 
	 // Metacharcters
	 
	 System.out.println(Pattern.matches("[\\D]+","Absbsbsb"));//true
	 
	 
	 
	 String matcher = "[\\d]{10}";
	 String demo = "8109274930";	 
	 
	 System.out.println("Phone number :"+Pattern.matches(matcher, demo));
	 
	 
	 
	 String a = "Zyush1hdjshdA";
	 String pattern_a = "[A-Z][a-z]*[0-9][a-z]*[A-Z]";
	 
	 System.out.println("name and number pattern:"+" "+Pattern.matches(pattern_a, a));
	 
	 
	 
	 String email = "ayushkanha12@gmail..com";
	 String verifier = "[A-Za-z_0-9\\-]+@[a-z]+[.]+[a-z]{2,3}";
	 
	 System.out.println("Email Pattern:"+" "+Pattern.matches(verifier, email));
	 
    
  }

}
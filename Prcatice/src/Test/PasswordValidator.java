package Test;

import java.util.Arrays;
import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the string array: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        String[] str = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + i + "th value for the string: ");
            str[i] = scanner.nextLine();
        }
        System.out.print("Enter the password format: ");
        String format = scanner.next();
        boolean isValid = validatePass(str, format);
        System.out.println("Is the password valid? " + isValid);
    }

    private static boolean validatePass(String[] str, String format) {
        int upperCaseCount = Character.getNumericValue(format.charAt(0));
        int digitSum = Character.getNumericValue(format.charAt(format.length() - 1));
        char[] lastThreeChars = format.substring(1, 4).toCharArray();
        Arrays.sort(lastThreeChars);
        for (String s : str) {
            char[] chars = s.toCharArray();
            if (chars.length < 8) {
                continue;
            }
            int upperCount = 0;
            int sum = 0;
            char[] lastChars = new char[3];
            int index = 0;
            for (char c : chars) {
                if (Character.isUpperCase(c)) {
                    upperCount++;
                }
                if (Character.isDigit(c)) {
                    sum += Character.getNumericValue(c);
                }
                if (index >= chars.length - 3) {
                	System.out.println("index = "+index);
                	System.out.println("char at index "+index+" is "+c);
                    lastChars[index - (chars.length - 3)] = c;
                }
                index++;
            }
            Arrays.sort(lastChars);
            if (upperCount == upperCaseCount && sum == digitSum && Arrays.equals(lastChars, lastThreeChars)) {
                return true;
            }
        }
        return false;
    }

}




//package Test;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class PasswordValidator {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("give size of string array : ");
//		int size = sc.nextInt();sc.nextLine();
//		String[] str = new String[size];
//		
//		for(int i=0;i<size;i++)
//		{
//			System.out.print("give the "+i+"th value for string :");
//			str[i]=sc.nextLine();
//		}
//		
//		System.out.println("Give the format on which the password should be : ");
//		String formate = sc.next();
//		
//		boolean bool = validatePass(str,formate);
//		System.out.println("the password is valid ? "+bool);
//
//	}
//
//	//in the format the first char is number which tells hpw many upper case 
//			//charracter are there, the last character of format tells the sum of the digit present in the password
//			//the 3 character in between format are last 3 letters of pass which are in reverese order.
//	private static boolean validatePass(String[] str, String formate) {
//		int first_char = Character.getNumericValue(formate.charAt(0));
//		System.out.println("first char = "+first_char);
//		int last_char = Character.getNumericValue(formate.charAt(formate.length() - 1));
//		System.out.println("last char = "+last_char);
//		char[] middle_chars = new char[3];
//		int n = 0;
//		int m = 0;
//		for (int i = 1; i < 4; i++) {
//			middle_chars[n] = formate.charAt(i);
//			n++;
//		}
//		System.out.println("sorting array...");
//		Arrays.sort(middle_chars);
//		System.out.println("Array sorted ...");
//		
//		for (int i = 0; i < str.length; i++) {
//			
//			System.out.println("inside for loop 1...");
//			
//			char[] ch = new char[str[i].length()];
//			char[] last_chars = new char[3];
//
//			if (ch.length >= 8) {
//
//				ch = str[i].toCharArray();
//				int upper = 0;
//				int sum = 0;
//				boolean is_same = false;
//				for (int j = 0; j < ch.length; j++) {
//					
//					System.out.println("inside second for loop...");
//					
//					if (Character.isUpperCase(ch[j]))
//						upper++;
//					if (Character.isDigit(ch[j]))
//						sum += Character.getNumericValue(ch[j]);
//				}
//
//				for (int j=ch.length-1; j>ch.length-4;j--) {
//					
//					System.out.println("inside 3rd for loop...");					
//					last_chars[m] = ch[j];
//					m++;
//				}
//				System.out.println("outside last for lopp...");
//				Arrays.sort(last_chars);
////				if (middle_chars.equals(last_chars))
////				{
////					System.out.println("both array are equal...");
////					is_same = true;
////				}
//				if (first_char == upper && last_char == sum && Arrays.equals(middle_chars, last_chars)) {
//					System.out.println("inside last if statement...");
//					return true;
//				}
//			}
//
//		}
//
//		return false;
//	}
//	
//}

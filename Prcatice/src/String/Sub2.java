package String;

import java.util.Arrays;

public class Sub2 {

	public static void main(String[] args) {
		String s = "hello";
		System.out.println("s = "+s+": "+s.hashCode());
		//String str2 = s.substring(5);
		char[] ch = s.toCharArray();
		String st = Arrays.toString(ch);
		String st1 = ""+st;
		System.out.println("String : "+st1);
		
		System.out.println("+++++++++++++");
		System.out.println(s.equals(st1));
		System.out.println("+++++++++++++");
		
		String s1 = String.join("", st1);
		System.out.println("joined string = "+s1);
		System.out.println("+++++++++++++");
		
		StringBuilder builder = new StringBuilder(st);
		
		System.out.println("Builder : "+builder+": "+builder.getClass());
		System.out.println("+++++++++++++");
		
		
		StringBuilder builder1 = new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			builder1.append(ch[i]);
		}
		String a = ""+builder1;
		System.out.println("a = : "+a+" "+a.getClass());
		System.out.println("After appending : "+builder1+" : "+builder1.hashCode());
		System.out.println("+++++++++++++");
		System.out.println(s.equals(a));
		
		
		System.out.println("--------------");
		
//		if(s==a)
//		{
//			System.out.println("true");
//		}
		System.out.println("substring : "+builder1.substring(0, 4));

	}

}

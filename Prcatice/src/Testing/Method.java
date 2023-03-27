package Testing;

import java.util.Arrays;

interface Test
{
	 void say_name();
}

public class Method implements Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a = 4;
		Integer b = 4;
		
		System.out.println(a==b);
		//System.out.println(a.hashCode()+""+b.hashCode());
		
		String s1 = "hello";
		String s2 = new String(s1);
		String s3 = "hello";
		
		String ar = "bcdae";
		
		char[] ch = ar.toCharArray();
		Arrays.sort(ch);
		for(char c:ch)
			System.out.print("ch = "+c+"\t");
		
		
		String str = Arrays.toString(ch);
		System.out.println("str = "+str);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.hashCode()+" a = "+a.hashCode()+" b = "+b.hashCode());
	}

	@Override
	public	 void say_name() {
		// TODO Auto-generated method stub
		
	}

}

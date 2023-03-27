package Test2;

public class CheckMemoryLocation 
{
	public static void main(String[] args)
	{
		String s1 = "Ayush";
		String s2 = "Kanha";
		String s3 = "Ayush";
		
		System.out.println("s1 hash code = "+s1.hashCode());
		System.out.println("s2 hash code = "+s2.hashCode());
		System.out.println("s3 hash code = "+s3.hashCode());
		
		
		System.out.println(s1==s3);
		
		String s4 = new String("Ayush");
		String s5 = new String("Kanha");
		System.out.println("s4 hash code = "+s4.hashCode());
		System.out.println("s5 hash code = "+s5.hashCode());
		
		System.out.println(s1==s4);
		System.out.println(s2==s5);
		
	}
}

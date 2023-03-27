package Test;

public class ForTesting 
{
	public static void main(String[] args)
	{
		String str = "Ayush";
		char[] ch = str.toCharArray();
		//System.out.println("char arraay = "+ch);
		System.out.println(str.getClass());
		for(char ch1:ch)
		{		
			System.out.print(ch1);
		}
	
		StringBuilder sb = new StringBuilder();
		
		for(char c:ch)
		{
			sb.append(c);
		}
		
		System.out.println(sb);
	}
	
}

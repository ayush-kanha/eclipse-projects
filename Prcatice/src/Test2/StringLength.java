package Test2;

public class StringLength {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str = "hello Ayush";
		//String str2;
		
		Integer in = new Integer(10);
		String j = String.valueOf(in);
		
		System.out.println("Integer value = "+j);
		
		int max = 100;
		int count=0;
		char ch1 = 'a';
		System.out.print("ascii value of j =");
		System.out.println('j'+'k'-'k');
		System.out.println('j'+'a'+'v'+'a'+"aa");
		
		for(char ch:str.toCharArray())
		{
//			if(ch == ' ')
//				continue;
			count++;
		}
		
		
		System.out.println("Charachter values : ");
		
		for(char i='a';i<='z';i++)
		{
			System.out.print(i+" =");
			System.out.println(i+ch1-ch1);
		}
		
//		char[] ch = str.toCharArray();
//		
//		for(int i=0;ch[i]!='\0';i++)
//		{			
//			count++;
//		}
		System.out.println(count);
 	}

	public static void main(String args)
	{
	}
	
}

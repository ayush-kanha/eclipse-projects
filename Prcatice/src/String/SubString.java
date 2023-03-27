package String;

import java.util.Arrays;

public class SubString 
{

	public static void main(String[] args) 
	{
		String str = "This is a dog ogd isth";
		String[] arr = new String[str.length()];
		int index=0;
		int begin=0;
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				arr[index]=str.substring(begin,i);
				System.out.println(arr[index]);
				begin=i+1;
				index++;
				System.out.println("index ="+index);
				
			}
		}
		
		
		arr[index] = str.substring(begin,str.length());
		
		
		for(int i=0;i<index;i++)
		{
			System.out.println("arr at "+i+" "+arr[i]);
			for(int j=i+1;j<index+1;j++)
			{
				System.out.println("arr at "+j+" "+arr[j]);
				if(arr[i].length()==arr[j].length())
				{
					char[] a1 = arr[i].toCharArray();
					char[] a2 = arr[j].toCharArray();
					System.out.println("a1 = "+a1.toString());
					System.out.println("a2 = "+a2.toString());
					if(Arrays.equals(a1, a2))
						continue;
					
					 Arrays.sort(a1);
					Arrays.sort(a2);
					
					if(Arrays.equals(a1, a2))
						count++;					
				}
			}
		}
		
		System.out.println(count);
		
//		String substr = "";
//		int count = 0;
//		for(int i=0;i<str.length();i++)
//		{
//			for(int j=i+1;j<str.length();j++)
//			{
//				substr = str.substring(i,j+1);
//				System.out.println(substr);
//				count++;
//			}
//		}
//		System.out.println(count);
	}

}

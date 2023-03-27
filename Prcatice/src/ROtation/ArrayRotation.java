package ROtation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayRotation 
{
	public static void main(String[] rgs)
	{
		Integer[] arr = new Integer[] {1,2,3,4,5};
		
		int d = 1;
 		
		int[] b = new int[arr.length];
		int[] c = new int[arr.length];
		
		List<Integer> list = Arrays.asList(arr);
		
		List<Integer> list2 = new ArrayList<>();
		
		int length = list.size();
		
		//System.out.println(list.se);
		
		
		for(int i=length-d;i<length;i++)
		{			
			list2.add(list.get(i));		
		}
		
		
		for(int i=0;i<length-d;i++)
		{
			list2.add(list.get(i));
		}
	
		System.out.println(list2);
		
		
//		int d = 1;
//		
		for(int i=d;i<length;i++)
		{
			list2.add(list.get(i));
		}
		
		for(int i=0;i<d;i++)
		{
			list2.add(list.get(i));		
			
		}
		
		System.out.println(list2);
		

	}
}

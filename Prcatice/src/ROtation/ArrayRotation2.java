package ROtation;

import java.util.ArrayList;

public class ArrayRotation2 {
	
	final static int a;
	public static int b = 10;
	
	static {
		a =10;
		b=12;
	} 

	public static void main(String[] args) 
	{
		
		b=13;
		//System.out.println("a = "+a);
		int[] arr = {1,2,3,4,5};
		int k =1;
		
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.println("For rotating forward...");
		
		al.add(arr[arr.length-1]);
		
		for(int i=0;i<arr.length-1;i++)
		{
			al.add(arr[i]);
		}
		
		System.out.println(al);

	}

}

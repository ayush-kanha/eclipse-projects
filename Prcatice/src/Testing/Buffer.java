package Testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Buffer {

	public static void main(String[] args) {
		
		
		ArrayList<Float> al = new ArrayList<>();
		
		al.add(2.2f);
		al.add(40.3f);
		al.add(6.2f);
		al.add(10.3f);
		al.add(22.2f);
		al.add(12.3f);
		al.add(-1.5f);
		al.add(60.0f);
		al.add(222.0f);
		
		float largest = al.get(0);
		float largest_2 = al.get(0);
		int length = 0;
		
		for(float f:al)
		{
			length++;
			if(f>largest)
				largest=f;
		}
		
		
		for(int i=0;i<length;i++)
		{
			if(al.get(i)==largest)
				continue;
			if(al.get(i)>largest_2)
				largest_2=al.get(i);
		}
		
		
		System.out.println("Second largest = "+largest_2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(a[a.length-3]);
		

		
		
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
//		
//		System.out.println(sb1.hashCode());
//		System.out.println(sb2.hashCode());
//		
//		System.out.println(sb1.toString().equals(sb2.toString()));
		//System.out.println(sb1.contentEquals(sb2));
//		
//		String str1 = "Ayush";
//		String str2 = new String("Ayush");
//				
//		System.out.println(str1.hashCode()+"  "+str2.hashCode());		

	}

}

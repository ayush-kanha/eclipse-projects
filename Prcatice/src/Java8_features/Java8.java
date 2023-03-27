package Java8_features;

import java.util.ArrayList;
import java.util.List;

public class Java8 {

	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(3);
		
		list.forEach(e -> System.out.println(e));
		
		
		
		String a = 1+2+"asx"+3+"dsd";
		System.out.println(a);
	}
			
}

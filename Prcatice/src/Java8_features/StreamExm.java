package Java8_features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExm {

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		map.put(1, 2);
		map.put(2, 2);
		map.put(3, 2);
		map.put(4, 2);
		map.put(5, 3);
		map.put(22, 3);
		
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Ayush");
		al.add("Gupta");
		al.add("Kanha");
		al.add("anil");
		
		boolean i = al.stream().allMatch(str -> Character.isUpperCase(str.charAt(0)) );
		System.out.println(i);
		
		//list.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		//list.stream().filter(n->n%2==0).map(n->n*2).forEach(n->System.out.println(n));
		
		map.entrySet().stream().filter(k->k.getValue()==3).forEach
		(k->System.out.println(k.getKey()+" "+k.getValue()));
		
		Stream str =  al.stream().skip(3);
		str.forEach(n -> System.out.println(n));	

	}

}
 
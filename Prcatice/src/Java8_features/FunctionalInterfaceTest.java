package Java8_features;

@FunctionalInterface
interface Addition<T>
{
	T add(T a1,T a2);
	
}


public class FunctionalInterfaceTest {

	public static void main(String[] args) 
	
	{
	
		
		Addition<Integer> a = (b,c)-> {
			int d = b+c;
			
			return d;
		};
		
		
		Addition<String> str = (s1,s2)->{
			String s3 = s1.substring(3, 8);
			return s3;
		};
				
		System.out.println(a.add(10, 20));
		System.out.println(str.add("ayushjigupta", null));
	}

}

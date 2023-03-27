package Java8_features;

@FunctionalInterface
interface Addition1
{
	void add(int a,int b);
}


@FunctionalInterface
interface Multi
{
	void multi(int a,int b);

}


public class LambdaExm2 

{
	public static void main(String[] ar)
	{
		Addition1 ad1 = (a,b)-> System.out.println( a+b);	
		ad1.add(10,30); 	
	}
}

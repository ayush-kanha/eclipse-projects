package Java8_features;


interface A
{
	public void saySomething();
	
	default String optional() {
		return "this is optional" ;
	}
	
	public static void kulti()
	{
		System.out.println("kulti...");
	}
}

class B implements A
{

	@Override
	public void saySomething() {
		System.out.println("Hi A say ");
		
	}
	
}

public class DefaultMethod {

	public static void main(String[] args) {
		
		A a = new B();
		B b = new B();
		a.saySomething();
		b.optional();
		
		
		A.kulti();
	}

}

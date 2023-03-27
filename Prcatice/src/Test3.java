

class Vehicle
{
	Vehicle(String name)
	{
		System.out.println("String const");
	}
	
	Vehicle(int name)
	{
		System.out.println("int const");
	}
}

public class Test3 {

	public static void main(String[] args) 
	{
		Vehicle v = new Vehicle(null);
	}

}

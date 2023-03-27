package Test2;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String msg)
	{
		super(msg);
	}
}


public class CustomException 
{
	public static void main(String[] ar)
	{
		try 
		{
			validateAge(12);	
		}
		catch(InvalidAgeException e)
		{
			System.out.println("exception catched....");
			System.out.println(e);
		}
	}
	
	public static void validateAge(int age) throws InvalidAgeException
	{
		if(age<18)
			throw new InvalidAgeException("Age is not valid to vote");
		else
			System.out.println("Welcome to vote...");
	}
	
}

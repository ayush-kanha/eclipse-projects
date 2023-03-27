
public class Exceptions {

	public static void main(String[] args) 
	{
		int a = show("Ayush");
//		String a = null;
//		System.out.println("not a");
		System.out.println(a);

	}

	private static int show(String i) 
	
	
	{
		try
		{
			
			System.out.println("Insude try block...");
			//int a = 10/0;
			try
			{
				System.out.println("inside inner try...");
				int b = 2/1;
				return 9;
				
			}
			
			
			finally
			{
				
				try
				{
					System.out.println("inside finally try...");
				}
				catch(Exception e)
				{
					System.out.println("inside finally catch");
				}
				
				
				System.out.println("inside inner finally...");
				return 8;
			}
			
		
//			
//			return 0;
		}
		finally
		{
			System.out.println("inside finally block...");
			return 2;
		}
//		catch (Exception e) {
//			System.out.println("????");
//		}
//		try
//		{
//			int b = 2/0;
//			System.out.println(".....");
//		}
//		catch (Exception e) {
//			System.out.println("????");
//		}
		
		
		
		
		
	}

}


package Java8_features;

public class LambdaExm1 
{
	public static void main(String[] ar)
	{
		Runnable r1 = ()-> {
			System.out.println("This is uder thread one");
			
			for(int i=1;i<=10;i++)
			{
				System.out.println(i);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
	}
	
	
	
}

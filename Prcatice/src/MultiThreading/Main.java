package MultiThreading;

class MultiThreading implements Runnable
{

	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println(2*i);
			
			try
			{
				Thread.sleep(100);
				//System.out.println();
				
				System.out.println("in try : "+Thread.currentThread().getId()); 
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		Thread.currentThread().stop();
		System.out.println("outside try :"+Thread.currentThread().getState()); 
		
	}

}

public class Main
{
	public static void main(String[] args)
	{
		MultiThreading m1 = new MultiThreading();
		Thread t1 = new Thread(m1);
		
		System.out.println(t1.getName()+":"+t1.getState());
		
		t1.start();
		
		//t1.stop();
		
		System.out.println("in main "+t1.getState());
	}
}
package MultiThreading;

class Company
{
	int i;
	boolean f = false;
	
	
	synchronized public void producer(int i) throws Exception
	{
		this.i = i;
		
		if(f)
		{
			Thread.currentThread().wait();
			Thread.currentThread().notify();
		}
		
		System.out.println("produced "+i);
		f = true;
		
	}
	 
	synchronized public int consumer(int i) throws Exception
	{
		this.i = i;
		if(!f)
		{
			Thread.currentThread().wait();
			
		}
		System.out.println("Consumed "+i);		
		f=false;
		Thread.currentThread().notify();
		return i;
	}
}


class Producer extends Thread
{
	Company c;
	
	Producer(Company c)
	{
		this.c = c;
	}
	
	public void run()
	{
		int i=1;
		while(true)
		{
			try {
				this.c.producer(i);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
	}
	
}
}

class Consumer extends Thread
{
	Company c;
	
	Consumer(Company c)
	{
		this.c = c;
	}
	
	public void run()
	{
		int i=1;
		while(true)
		{
			try {
				this.c.consumer(i);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}
	
}


public class Test {

	public static void main(String[] args) {
		
		Company c= new Company();
		Producer p = new Producer(c);
		Consumer c1 = new Consumer(c);
		
		p.start();
		c1.start();
	}

}

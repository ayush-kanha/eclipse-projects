package com.pract;

public class ThreadExm extends Thread
{


	
	public void run()
	{
		
		for(int i=0;i<5;i++)
		{
		
			try {
				Thread.sleep(100);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			
		}
	}

	public static void main(String[] args) throws InterruptedException
	{
		
		ThreadExm t1 = new ThreadExm();
		ThreadExm t2 = new ThreadExm();
		
		t1.start();
		t1.sleep(100);
		t2.start();
	}

}

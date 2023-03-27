package Test;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int p = 0;
		int x = sc.nextInt();
		for(int i=2;i<x;i++)
		{
			if(x%i==0)
			{
				p = 0;
				break;
			}	
			else
				p=1;
		}
		
		if(p==1)
			System.out.println("prime");
		else
			System.out.println("Not prime");

	}

}

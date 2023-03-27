package Testing;

public class Break {

	public static void main(String[] args) 
	{
		int n = 10;
		for(int i=1;i<10;i++)
		{
			for(int j=1;j<n;j++)
			{
				boolean a = false;
				System.out.print("inside second for loop i+j = ");
				System.out.println(i+j);
				if((i+j)%j==1)
				{	
					System.out.print("i+j = ");
					System.out.println(i+j);
					a=true;
					if(a==true)
						break;
				}	
				System.out.println("second for..");
			}
			System.out.println("first for..");
		}

	}

}

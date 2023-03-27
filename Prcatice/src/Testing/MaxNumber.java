package Testing;

public class MaxNumber 
{
	public static void main(String[] args)
	{
		String str = "1234";
		int k = 1;
		Integer maximum = Integer.valueOf(str);
		System.out.println("current maximum = "+maximum);
		MaxNumber num = new MaxNumber();
		String maxNumber = num.maxNumber(str.toCharArray(),k);
		if(Integer.valueOf(maxNumber)<maximum)			 
			System.out.println("Maximum number = "+maximum);
		else
			System.out.println("Maximum number = "+maxNumber);
	}

	private String maxNumber(char[] num, int k) 
	{
		int len = num.length;
		StringBuilder number = new StringBuilder();
		char temp;
		System.out.println("k = "+k);
		if(k==0)
			return number.toString();
		System.out.println("+++++++++++++++");
		
		System.out.print("number after iteration = ");
		for (int i = 0; i < num.length; i++) 
		{
			System.out.print(num[i]);
		}
		
		System.out.println("\n");
		
		for (int i=0;i<1;i++)
		{
			System.out.println("char at i "+i+" =" +Character.getNumericValue(num[i]));
			
			
			for(int j=i+1;j<k+1;j++)
			{
				System.out.println("char at j "+j+" =" +Character.getNumericValue(num[j]));
				
				if(Character.getNumericValue(num[j]) >Character.getNumericValue(num[i]))
				{
					temp = num[i];
					num[i] = num[j];
					num[j]=temp;
				}
				//System.out.println("number after "+j+" iteration "+num);
			}
			
			
			System.out.println(num);
			//System.out.println("k = "+k);
			maxNumber(num, k-1);
		}
		
		
		for(int i=0;i<len;i++)
		{
			number.append(num[i]);
		}
		
		System.out.println("numberrrr = "+number);
		
		return number.toString();
	}
	
}

package Testing;


public class Demo {

	public static void main(String[] args) {
		
		int[] arr = new int[] {4,5,8,5,5,5,4,4,4};
		
		//Arrays.sort(arr);
		
		int len = arr.length;
		int num = arr[0];
		int count = 1;
		int finalCount = 0;
		
		for(int i=0;i<len;i++)
		{
			count = 1;
			
			for(int j=i+1;j<len;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}			
			}
			
			
			
			if(count>=finalCount)
			{
				if(num<arr[i])
					num = arr[i];
				finalCount = count;	
				
			}	
		}
		
		System.out.println("number = "+num + " frequency = "+finalCount);

	}

}

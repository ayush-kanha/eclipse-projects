package com.practice;

public class StringCompare {

	public static void main(String[] args)
	{
		String str = "()()";
		
		char[] ch = new char[str.length()];
		char[] open1 = new char[10];
		char[] close1 = new char[10];
		int open=0;
		int close=0;				
		ch = str.toCharArray();		
		boolean temp = false;
		//boolean isSynchronized=false;
		
		//int i = Character.getNumericValue(0)
		
		
		for(int i=0;i<=str.length()-1;i++)
			{
				if(ch[i]=='(')
				{
					open+=1;
					open1[i] = ch[i];
				}	
				else if(ch[i]==')')
				{	
					close+=1;	
					close1[i]=ch[i];
				}
			}
		
		if(ch[0]==')' || open!=close)
			System.out.println("not synchronized...");
		
		else
		{
			for(int i=0;i<=(str.length()-1-i);i++)
		{
			if(ch[i]=='(' && ch[i+1]==')')
			{
				temp = true;
			}
			
			else
				temp=false;
			
		}
			if(temp==true)			
				System.out.println("synchronized...");
			else if(temp==false)
				System.out.println("not synchronized...");
		
		
		}
		
		
//		System.out.println("ch[0]="+ch[0]); (ch[i]=='(' && ch[str.length()-i-1]==')') || 
//		
//		for(int i=0;i<=str.length()-1;i++)
//		{
//			if(ch[i]=='(')
//				open+=1;
//			else if(ch[i]==')')
//				close+=1;			
//		}		
//		if(open==close)
//			temp=true;		
//		
//		if(temp==false || ch[0]==')')
//			System.out.println("not synchronized...");		
//		
//		else 
//		{
//			for(int i=0;i<=str.length()-1;i++)
//			{
//				if(ch[i]=='(' && ch[str.length()-i-1]==')')
//				{
//					isSynchronized=true;
//				}
//			}
//		}
//		
//		if(isSynchronized==true)
//			System.out.println("is synchronized...");
//		else if(isSynchronized==false)
//			System.out.println("not synchronized...");
	}
}


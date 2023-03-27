package com.pract;

import java.util.ArrayList;
import java.util.List;

public class ReturnTest 
{
	
	public static void addToList(List<String> list)	
	{
		if(list.get(0).equals("Ayush")) {
	        list.add("Pray today");
	        return;
	    }

	    if(list.get(1).equals("Kanha")) {
	        list.add("Work today");
	        return;
	    }

	    if(list.get(2).equals("Gupta")) {
	        list.add("Tr today");
	        return;
	    }
	}
	
	
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<>();
		list.add("Ayush");
		list.add("Kanha");
		list.add("Gupta");
		addToList(list);
		for(String str:list)
		{
			System.out.println(str);
		}
	}
}

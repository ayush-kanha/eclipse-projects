package Test;

import java.util.*;
import java.util.stream.*;


class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class Demo 
{

	public static void main(String[] args) 
	{
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(25);
		al.add(32);
		al.add(34);
		al.add(44);
		al.add(50);
		al.add(55);
		
		//set.a
		
		 List<Product> productsList = new ArrayList<Product>();  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));  
	        // This is more compact approach for filtering data  
	        List<String> collect = productsList.stream()  
	                             .filter(product -> (product.price >= 30000 && product.price<=90000))	                             
	                             .map(Product -> Product.name+" company").collect(Collectors.toList());
	                             //.forEach(product -> System.out.println(product.name)); 

// Count in Stream	: used for counting of filtered records    
	        
	        int count = (int )productsList
	        			.stream()  
	        			.filter(product -> (product.price >= 30000 && product.price<=90000)).count();
	        
	        System.out.println("Count = "+count);
	        
	        for(String str:collect)
	        {
	        	System.out.println(str);
	        }
	        
	        
	        System.out.println("++++++++++++");
	        
// Reduce in Stream	 : used for generating result by adding stream of data like total sum of price of products      
	        
	        
	        float reduce =productsList.stream().map(Product -> Product.price).reduce(0.1234f, (s,pri)->s+pri);
	        int a = (int)(reduce);
	        String str = String.format("%09d", a);
	        System.out.println(str);
	        
// Iterator in Stream	        
	        
		Stream<Integer> limit = Stream.iterate(6, i -> i+3 )
		.filter(x-> x<20)
		.limit(3);
		
		
		limit.forEach(System.out::println);
		
// Testing stream again
		
		List<Integer> lis = al.stream().filter(i -> i%5==0 && i%2==0).map(i -> i*2).collect(Collectors.toList());
		
		int count1 = (int) al.stream().filter(i -> i%5==0 && i%2==0).count();
		System.out.println("Count1 = "+count1);
		
		for(Integer i:lis)
			System.out.println(i);


	}

}

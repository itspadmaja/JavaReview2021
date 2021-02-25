package ooP_Encaspulation;//Constructor Concept

import java.util.ArrayList;

public class Product {
	
	 String name;
	 int price;
	 String color;
	 ArrayList<String> sellerList;
	
	public Product(String name) {
		this.name = name;
	}
	
	public Product(String name,int price,String color,ArrayList<String> sellerList) {
		
		this.name = name;
		this.price = price;
		this.color = color;
		this.sellerList = sellerList;
		
	}
	
	
	
	}
	
	



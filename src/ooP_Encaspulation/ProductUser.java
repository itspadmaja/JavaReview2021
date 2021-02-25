package ooP_Encaspulation;//Constructor Concept

import java.util.ArrayList;

public class ProductUser {

	public static void main(String[] args) {
		
		ArrayList<String> AppleSellerList = new ArrayList<String>();
		AppleSellerList.add("AliBaba.com");
		AppleSellerList.add("Amazon.com");
		AppleSellerList.add("Neon Enterprises");
		
		Product p1 = new Product("Apple",100,"Silver",AppleSellerList);
		System.out.println("The Product name is " + p1.name + " Product Seller : " + p1.sellerList);
		System.out.println(AppleSellerList.size());
		for(String l : AppleSellerList) {
			System.out.println(l);
		}
		
		
	}
	
	
	
	
	
	
	
	}




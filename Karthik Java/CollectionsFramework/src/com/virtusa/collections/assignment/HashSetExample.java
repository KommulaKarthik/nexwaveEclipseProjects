package com.virtusa.collections.assignment;

import java.util.HashSet;
import java.util.Iterator;

class Product{
	private int productId;
	private String productName;
	private float productPrice;
	
	

	public Product(int productId, String productName, float productPrice) {
		
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}



	public long getProductId() {
		return productId;
	}



	public void setProductId(int productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public float getProductPrice() {
		return productPrice;
	}


	
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	
	@Override
	public boolean equals(Object x) {

		Product p =(Product)x;

		

		if(this.productId == p.productId) 
			return true;
		else
			return false;		
	}
	@Override
	public int hashCode( ){
		
		return this.productId;
	}
	
	
	
	
	
	
}

public class HashSetExample {
	
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 HashSet<Product> product = new HashSet<Product>( );
		 product.add(new Product(1,"Mobile",45000.54f));
		 product.add(new Product(5,"TV",100000.54f));
		 product.add(new Product(3,"Washing-Machine",60000.54f));
		 product.add(new Product(8,"AC",32000.54f));
		 product.add(new Product(4,"Refrigerator",85000.54f));
		 product.add(new Product(3,"Washing-Machine",60000.54f));
		 
		 System.out.println(product.toString());
		 
		 Iterator<Product> allProducts = product.iterator();
		 while(allProducts.hasNext()){
			 Product p=allProducts.next();
			 
			 System.out.println(p.getProductName() + " " + p.getProductPrice());
		 }

	}

}

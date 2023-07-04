package com.java.concepts;

public class Orders implements Flipkart, Amazon{

	@Override
	public void dress() {
		System.out.println("Order from flipkart");
		
	}

	@Override
	public void shoe() {
		System.out.println("Order from Amazon");
		
	}
	
	public static void main(String[] args) {
		Orders o = new Orders();
		o.shoe();
		
		Flipkart f = new Orders();
		f.shoe();
		
		Amazon a = new Orders();
		a.shoe();
	}

	
	
	

}

package com.java.concepts;

import java.util.Map;

public class CashCounter extends Reliance{

	@Override
	public void speaker() {
		System.out.println("Pay by cash");
		
	}
	
	public void cosmetics() {
		System.out.println("pay by cash");
	}
	
	public static void main(String[] args) {
		
		
		
		CashCounter c = new CashCounter();
		c.dress();
		c.cosmetics();
		c.speaker();
	}
	
	
}

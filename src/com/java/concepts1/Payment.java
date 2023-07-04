package com.java.concepts1;

public class Payment implements GPay,Phonepe {

	@Override
	public void scratchCard() {
		System.out.println("scratch card");
	}

	@Override
	public void transfer() {
		System.out.println("transfer using gpay");
	}

	@Override
	public void scanner() {
		System.out.println("scanner");
	}
	
	public static void main(String[] args) {
		Payment p = new Payment();
		p.transfer();
	}

}

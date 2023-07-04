package com.java.concepts;

public final class StaticAndFinal {

	static int a = 60;
	
	static String str;
	
	int b = 100;
	
	final int bad_request = 400;
	
	public static void m1() {
	//	bad_request = 500; --> final variable cannot be assigned
		a = 50;
		System.out.println(a);
		//System.out.println(b);
	}
	
	public static void m2() {
		final int not_found = 404;
		System.out.println(str);
	//	System.out.println(b);
	}
	
	public final void m3() {
		System.out.println("final method");
	}
	
	public static void main(String[] args) {
		m1();
		m2();
	}
}

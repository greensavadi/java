package com.java.concepts;

public class DataTypesTest {
	
	 void primitiveTest() {
		byte sno = 127;
		byte n = (byte)5;
		short salary = (short)25000;
		int lpa = 1645676456;
		int a = 1645677867;
		long contact = 9876543213L;
		float percentage = 45.50F;
		double interest = 12345.80;
		double in = 12345.807;
		char initial = 'a';
		boolean codition = true;
		
		System.out.println(sno);
		
		String name = "James gosling";
		
		byte b = (byte)(sno+n);
		System.out.println(b);
		int c = sno+a+initial;
		System.out.println(c);
		
		System.out.println(in == interest);
		
		if(in == interest) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
				
	}
	
	public void widening() { // converting smaller data type into larger data type
		short s = 23000;
		int a = s;
		System.out.println(a);
	}
	
	public void narrowing() { //converting larger data type into smaller data type
		int a = 50000;
		short s = (short) a;
		
	}
	
	public static void main(String[] args) {
		DataTypesTest d = new DataTypesTest();
		d.primitiveTest();
		d.widening();
	}

}

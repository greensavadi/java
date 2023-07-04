package com.java.concepts;

import java.util.Scanner;

public class ScannerTest {
	
	static Scanner sc = new Scanner(System.in);
	public static void primitive() {
		
		System.out.println("Enter value for a : ");
		int a = sc.nextInt();
		String format = String.format("%04d", a);
		System.out.println(format);
		System.out.println("Enter value for b : ");
		int b = sc.nextInt();
		int c = a+b;
		System.out.println("Sum is : "+c);
	}
	
	public static void strTest() {
		
		System.out.println("Enter the String for getting complete String : ");
		String n = sc.nextLine();
		System.out.println("The Entire String is : "+n);
		
		System.out.println("Enter the String for getting complete String : ");
		String n1 = sc.nextLine();
		System.out.println("The Entire String is : "+n1);
		
		System.out.println("Enter the String for getting complete String : ");
		String n2 = sc.nextLine();
		System.out.println("The Entire String is : "+n2);
		
		System.out.println("Enter the partial String");
		String name = sc.next();
//		System.out.println("The name is : "+name);
//		
//		System.out.println("Enter the String for getting complete String : ");
		String n3 = sc.nextLine();
		System.out.println("The Entire String is : "+n3);
	
	}
	
	public void charTest() {
		char ch = sc.next().charAt(5);	//n
		System.out.println(ch);
	}

	public static void main(String[] args) {
		primitive();
		//strTest();
//		ScannerTest s = new ScannerTest();
//		s.charTest();
		
	}

}

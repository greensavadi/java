package com.java.concepts;

public class LoopStatements {

	
	public static void forTest() {
		
		for(int i=1;i<=5;i++) {
			System.out.print(i);
		}
		System.out.println();
		for(int j=100;j>=91;j--) {
			System.out.print(j+" ");
		}
	}
	
	public static void whileTest() {
		int i=100;
		while(i<=5) {
			
			System.out.print(i);
			i++;
		}
	}
	
	public static void doWhileTest() {
		int i=100;
		do {
			System.out.println(i);
			i++;
		}while(i<=5);
	}
	
	public static void postAndPre() {
		for(int i=1;i<=5;i++) {
			System.out.println(i++);
		}
		System.out.println("==========");
		for(int j=1;j<=5;++j) {
			System.out.println(++j);
		}
	}
	
	public static void main(String[] args) {
//		forTest();
//		whileTest();
//		doWhileTest();
		postAndPre();
	}
}

package com.java.concepts;

public class ConditionalStatements {
	
	public  void major() {
		int age = 25;
		
		if((age >= 18)&&(age<=100)) {
			System.out.println("major");
		}
		else if((age>=1)&&(age<18)){
			System.out.println("minor");
		}
		else {
			System.out.println("Invalid age");
		}
	}
	
	public static void m1() {
		for(int i=1;i<=10;i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		m1();
	}

}

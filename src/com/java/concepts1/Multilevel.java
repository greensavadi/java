package com.java.concepts1;

import com.java.concepts.CashCounter;

//Method Overloading
public class Multilevel extends CashCounter {
	
	public void student() {
		System.out.println("all students");
	}
	
	public void method2() {
		System.out.println("method 2");
	}
	
	public void student(int sno) {
		System.out.println(" Specific Student ");
	}
	public void student(String name) {
		System.out.println("Specific Student "+name);
	}
	
	public void student(int sno,String name) {
		System.out.println("Student name : "+name+"   student sno : "+sno);
	}
	
	public void student(String address,int sno) {
		System.out.println("Student address & student sno");
	}
	
	public static void main(String[] args) {
		Multilevel m = new Multilevel();
		m.student(12, "abc");
		m.student("java");
	
	}
	

}

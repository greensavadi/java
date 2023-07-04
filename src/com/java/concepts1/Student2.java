package com.java.concepts1;

public class Student2 extends Student1{
	
	@Override
	public void student(String address) {
		System.out.println("Student Address is : "+address);
		super.student("James");
	}
	
	public static void main(String[] args) {
		Student2 s = new Student2();
		s.student("Chennai");
	}

}

package com.java.concepts;

public class Teacher extends Student{
	
	public Teacher() {
		
		System.out.println("Teacher");
	}
	
	public Teacher(String address) {
		System.out.println(address);
	}
	

	public static void main(String[] args) {
		Teacher t = new Teacher("chennai");
		
		Student s = new Student("java");
		
		
		
	}
}

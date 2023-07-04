package com.java.concepts;

public class Student {
	
//	public Student() {		//default constructor
//		
//	}
	
	
	public Student(int a) {		//parameterized constructor
		this();  //constructor chaining
		System.out.println("parameterized cons");
	}
	
	public Student() {		//Non-parameterized constructor
		System.out.println("non-parameterized cons");
	}
	
	public Student(String name) {
		this(8);	//constructor call
		System.out.println("Student name is : "+name);
		this.add();	//method call
		this.sub();
	}
	
	public void add() {
		this.sub();
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println(c);
	}
	
	public void sub() {
		System.out.println("sub");
	}
	
	
	
	
	public static void main(String[] args) {
		
		Student s2 = new Student("java");
	
		
	}

}

package com.java.concepts;

public class StudentDetails {
	
	int a = 10;
	String s = "qwer";
	
	public void student() {
		System.out.println("Student");
	}
	
	public void student(String name) {		//String name = "Navin";
		System.out.println("Name of the Student is : "+ name);
	}
	
	
	
	public void student(String name,short sno) {
		System.out.println(name+" "+sno);
	}
	
	public void student(String name,byte sno) {
		System.out.println("Student name and sno are : "+name+" "+sno);
	}
	
	public void student(int sno,String address) {
		System.out.println("Student sno and Address are :");
	}

	
	public static void main(String[] args) {
		StudentDetails s = new StudentDetails();
		s.student();
		s.student("navin");
		//s.student("java", 1235);
		s.student("selenium", (short) 12);
		s.student("cucumber", (byte)45);
		s.student(2, "chennai");
	}
}

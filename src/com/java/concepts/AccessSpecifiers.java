package com.java.concepts;

public class AccessSpecifiers {
	
	public void studentId() {
		System.out.println("public method");
	}
	
	private void studentName() {
		System.out.println("private method");
	}
	
	protected void studentContact() {
		System.out.println("protected method");
	}
	
	void studentAddress() {
		System.out.println("default method");
		//changes from git 
		System.out.println("Also known as Package Method");
	}

	
	public static void main(String[] args) {
		AccessSpecifiers a = new AccessSpecifiers();
		a.studentAddress();
		a.studentContact();
		a.studentId();
		a.studentName();
	}
}

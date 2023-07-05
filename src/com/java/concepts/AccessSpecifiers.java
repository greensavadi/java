package com.java.concepts;

public class AccessSpecifiers {
	
	public void studentId() {
		System.out.println("public method");
	}
	
	private void studentName() {
		System.out.println("public");
	}
	
	protected void studentContact() {
		System.out.println("protected method");
	}
	
	void studentAddress() {
		System.out.println("default method");
	}

	
	public static void main(String[] args) {
		AccessSpecifiers a = new AccessSpecifiers();
		a.studentAddress();
		a.studentContact();
		a.studentId();
		a.studentName();
	}
}

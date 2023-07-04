package com.java.concepts;

public class SingleInherit extends AccessSpecifiers{
	
	public void studentDetails() {
		System.out.println("child method");
	}
	
	public static void main(String[] args) {
		SingleInherit s = new SingleInherit();
		s.studentDetails();
		s.studentAddress();
		s.studentContact();
		s.studentId();
		
		AccessSpecifiers a = new AccessSpecifiers();
		a.studentAddress();
		a.studentContact();
		a.studentId();
		
	
	}

}

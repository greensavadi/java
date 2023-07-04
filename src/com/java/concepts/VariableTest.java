package com.java.concepts;

public class VariableTest {
	
	int a = 10;		//Class variable with initialization
	
	String name ;	//Class variable without initialization
	
	public void meth1() {
		a = 20;				//value assigned for variable
		name = "java";
		System.out.println(a);
		System.out.println(name);
		System.out.println("Git");
	}
	
	public void meth2() {
		int a = 50;
		System.out.println(name);
	}
	
	public void meth3() {
		int b = 100;		//Local variable with initialization
		String s ;			//local variable without initialization
		System.out.println(b);
//		System.out.println(s);	//Local variable cannot be used if its not assigned
	}
	
	public void meth4(String name) {
		name = this.name;
		System.out.println(name);
	}
	
	public void meth5() {
		this.meth2();
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		VariableTest v = new VariableTest();
		v.meth2();
		v.meth1();
		v.meth3();
		v.meth4("Navin");
		v.meth5();
		
		
		
	}

}

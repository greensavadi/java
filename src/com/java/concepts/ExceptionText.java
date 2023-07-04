package com.java.concepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionText {

	public static void login() throws InterruptedException {
		Thread.sleep(4000);
	}
	
	public static void m1() throws NameException {
		String s = "asdf1234";
		throw new NameException(s);
	}

	public static void fileTest() throws FileNotFoundException, InterruptedException {
		File f = new File("");
		login();
		FileInputStream fis = new FileInputStream(f);
	}

	public static void main(String[] args) throws FileNotFoundException, InterruptedException, NameException {

		login();
		m1();
//		File f = new File("");
//
//		FileInputStream fis = new FileInputStream(f);
//		
//		Thread.sleep(3000);
//		int a[] = new int[5];
//		
//		a[6] = 100;

//		String s = "abc";
//		
//		s.charAt(3);

		List<Integer> l = new ArrayList<>();

		l.add(34);
		System.out.println(l.get(2));
//		try {
//			login();
//			System.out.println(l.get(0));
//
//		} finally {
//			System.out.println("finally meth");
//		}
//		System.out.println("Hi");

	}

}

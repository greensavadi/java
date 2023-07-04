package com.java.concepts;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrTest {
	
	public static void main(String[] args) {
		
		Object names[] = new Object[5];
		
		names[0] = "java";
		names[2] = "sel";
		names[3] = "java";
		names[1] = "sql";
		names[4] = "asd";
		
		Arrays.sort(names);
		
		System.out.println(names);
		
		System.out.println(Arrays.toString(names));
		List<Integer> mark_list = new LinkedList<>();
		 List<Object> asList = Arrays.asList(names);
		 System.out.println("            "+asList);
		
		int marks[] = new int[5];
		
		marks[3] = 98;
		
		for(int m : marks) {
			System.out.println(m);
		}
		
		for(int i=0; i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		Integer sno[] = new Integer[5];
		
		sno[2] = 45;
		sno[4] = 78;
		
		for(Integer i : sno) {
			System.out.println(i);
		}
		System.out.println("*************************");
		for(int i=sno.length-1;i>=0;i--) {
			System.out.println(sno[i]);
		}
		System.out.println("--------------------------------");
		
		System.out.println(names[2]);
		
		for(int i=0; i<names.length; i++) {
			if(i==3) {
				continue;
			}
			System.out.println(names[i]);
		}
		System.out.println("======================");
		
		for(Object n : names) {
			System.out.println(n);
		}
		
		
		
	}

}

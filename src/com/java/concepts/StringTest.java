package com.java.concepts;

import java.util.Arrays;

public class StringTest {

	public String[] splitt() {
		String[] split = new String[]{"java", "is" , "a"};
		
		return split;
		
	}
	public static void main(String[] args) {
		
		String s = "james gosling";
		
		String s1 = "James gosling";
		
		String s2 = "     james        ";
		
		int s_length = s.length();
		System.out.println(s_length);
		
		String concat = s.concat(s1);
		System.out.println(concat);
		System.out.println(s.concat(s1));
		
		boolean equals = s.equals("james gosling");
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s1.toLowerCase();
		System.out.println(lowerCase);
		
		boolean startsWith = s.startsWith("Ja");
		System.out.println(startsWith);
		
		boolean endsWith = s1.endsWith("ng");
		System.out.println(endsWith);
		
		boolean contains = s.contains("gos");
		System.out.println(contains);
		
		int indexOf = s.indexOf('s');
		System.out.println(indexOf);
		
		int lastIndexOf = s1.lastIndexOf('s');
		System.out.println(lastIndexOf);
		
		char charAt = s.charAt(7);
		System.out.println(charAt);
		
		String replace = s1.replace('s', 'e');
		System.out.println(replace);
		
		String replace2 = s.replace("jam", "jem");
		System.out.println(replace2);
		
		String substring = s.substring(3);
		System.out.println(substring);
		
		String substring2 = s.substring(3, 8);
		System.out.println(substring2);
		
		System.out.println(s2);
		String trim = s2.trim();
		System.out.println(trim);
		
		String s3 = "Java is a programming language";
		String[] split = s3.split("");
		System.out.println(Arrays.toString(split));
		
		System.out.println("=======");
		for(int i=0;i<split.length;i++) {
			System.out.println(split[i]);
		}
		
		
		for(String s6 : split) {
			System.out.println(s6);
		}
		
		
		
		
		
	}
}

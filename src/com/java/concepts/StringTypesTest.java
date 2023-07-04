package com.java.concepts;

public class StringTypesTest {
	
	public static void main(String[] args) {
		
		String s = "java";		//String literal
		String s1 = "java";
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		
		s=s.toUpperCase();
		s1 = s1.concat(s);
	//	System.out.println(upperCase);
		System.out.println(s);
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println("=====================");
		
		String s4 = "java";
		System.out.println(System.identityHashCode(s4));
		//System.out.println(System.identityHashCode(s1));
		
		String s2 = new String("java");	//String non-literal
		String s3 = new String("java");
		
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		
		System.out.println(s2.equals(s3));
		System.out.println(s2 == s3);
		
		
		StringBuffer sb = new StringBuffer("java");
		
		System.out.println(System.identityHashCode(sb));
		
		sb.append("sele");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		
		
	}

}

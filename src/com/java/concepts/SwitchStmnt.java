package com.java.concepts;

public class SwitchStmnt {

	
	public static void main(String[] args) {
		
		String error = "Not found";
		
		switch(error) {
		
		case "Bad request" :
			System.out.println(400);
			break;
		case "Unauthourized":
			System.out.println(401);
			break;
		case "Not found" :
			System.out.println(404);
			break;
		case "Server error" :
			System.out.println(500);
			break;
			
			default:
				System.out.println("Not an error");
		}
	}
}

package com.java.concepts;

public class NestedFor {

	public static void main(String[] args) {

//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		int i = 1;
		

		while (i <= 5) {
			int j = 1;
			while (j <= 5) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}

	}
}

//1
//12
//123

//*
//**
//***
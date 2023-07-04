package com.java.concepts;

public class TwoDArray {

	public static void main(String[] args) {

		Object marks[][][] = {
							{
								{2,3,4},
								{4,6},
								{5,7}
								}
							};
		

		marks[0][0][0] = 98;
		
		int a[][] = {
						{2,4,6},
							{7,4,8},
								{1}
							};
		
		
		for(int i=0;i<marks.length;i++) {
			
			for(int j=0;j<marks[i].length;j++) {
				for(int k=0;k<marks[i][j].length;k++) {
				System.out.print(marks[i][j][k]+" ");
				}
				System.out.println();
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		int a1[] = new int[]{2,4};
		

//		for(Object m[][] : marks ) {
//			for(Object m1[] : m) {
//				for(Object m2 : m1) {
//					System.out.print(m2+" ");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
		
		
	//	System.out.println(marks[5][2]);
		
//		for(int i=0;i<marks.length;i++) {
//			for(int j=0;j<marks[i].length;j++) {
//				for(int k=0;k<marks[j].length;k++) {
//				System.out.print(marks[i][j][k]+" ");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
//		
		
		

	}
}
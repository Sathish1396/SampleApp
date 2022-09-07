package com.loop;

public class ForLoop {
	public static void main(String[] args) {
		for (int i = 0; i <=5; i++) {
			
			System.out.println(i);

		}
		System.out.println("$$$$$$$$$$");
		
//		for (int row = 1; row <=4; row++) {
//			
//			for (int column = 1; column<=4-row; column++) {
//				System.out.println("$");
//			}
//			
//			System.out.println();
		
for(int row=1;row<=5;row++) {
			
			for(int column=1; column<=5-row; column++) {
			System.out.print("*");

		}
			System.out.println();
		}
		
			
		}
		
	}



package com.JavaCodePrac;

public class Starpattern {

	public static void main(String[] args) {
		
		//First Pattern
	
		System.out.println("first Pattern");

		for(int i=1;i<=4;i++) {
			
			for (int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//Second Pattern
		System.out.println("Second Pattern");
		
		for(int i=1;i<=4;i++) {
			
			for(int j=4;j>=i;j--) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//Third Pattern
		System.out.println("Third Pattern");
		for(int i=1;i<=4;i++) {
			
			for (int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i=1;i<=3;i++) {
			
			for(int j=3;j>=i;j--) {
				
				System.out.print("*");
			}
			
			System.out.println();
	}
	
		//Fourth Pattern
		System.out.println("Fourth Pattern");
		for(int i=1;i<=4;i++) {
			
			for (int j=4;j>=i;j--) {
				
				System.out.print(" ");
	
			}
			for (int k=1;k<=i;k++){
			
			System.out.print("*");

		}
		 System.out.println();
		
		}
		//Fifth Program
		System.out.println("Fifth Pattern");
		for(int i=1;i<=4;i++) {
			
			for (int j=1;j<=i;j++) {
				
				System.out.print(" ");
	
			}
			for (int k=4;k>=i;k--){
			
			System.out.print("*");

		}
		 System.out.println();
		
		}
		
		System.out.println("THE END");
	}
}

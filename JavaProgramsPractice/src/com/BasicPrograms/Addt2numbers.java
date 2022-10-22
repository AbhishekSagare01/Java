package com.BasicPrograms;

import java.util.Scanner;

public class Addt2numbers {

	public static void main(String[] args) {
		
		// Add two numbers
		
		int a = 29;
		
		int b =30;
		
		int sum= a+b;
		
		System.out.println("Sum of two numbers :"+ (a+b));
		
		System.out.println("Sum of two numbers :"+ sum);
		
		//Method two
		
		System.out.println("********");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First number :");
		int c= sc.nextInt();
		
		System.out.println("Enter Second number :");
		
		int d= sc.nextInt();
		
		int sum1= c+d;
		
		System.out.println("Sum of entered number is :"+ sum1);
		


	}

}

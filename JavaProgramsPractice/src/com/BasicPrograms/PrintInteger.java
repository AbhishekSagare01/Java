package com.BasicPrograms;

import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args) {
		
		
		//Print integer enter by user
		
		Scanner reader = new Scanner(System.in); // Scanner class 
		
		System.out.println("Please enter Integer Value :"); // Print your msg
		
		int num= reader.nextInt(); // take input from user
		
		System.out.println("Your entererd number = "+ num); // Print it
		
		
	}

}

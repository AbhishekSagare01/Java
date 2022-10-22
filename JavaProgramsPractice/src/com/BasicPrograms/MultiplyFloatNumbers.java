package com.BasicPrograms;

import java.util.Scanner;

public class MultiplyFloatNumbers {

	public static void main(String[] args) {
		
		
		//Multiply two float numbers
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter float number 1 : ");
		
		float a= sc.nextFloat();
		
		System.out.println("Enter float number 1 : ");
		
		float b= sc.nextFloat();
		
		float Mul= a*b;
		
		System.out.println("Multiplication for two floating number is :" + Mul);
		
		System.out.println();
		System.out.println("**********************");
		
		float c= 3.3f;
		float d=3.1f;
		System.out.println("Multiplication of 3.3 and 3.1 is "+(c*d));
	}

}

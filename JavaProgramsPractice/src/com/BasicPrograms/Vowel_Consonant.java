package com.BasicPrograms;

import java.util.Scanner;

public class Vowel_Consonant {

	public static void main(String[] args) {

		//two ways
		//1.Operators
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter Character or Name");
		char ch= sc.next().charAt(0);// there is no nextChar method in scanner class hence need to take in string and take charat 0 position
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			
			System.out.println("Its Vowel");
		}else {
			
			System.out.println("Its Cosonant");
		}
	

	//2.Switch statement
	
	switch(ch) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		
		System.out.println("Its Vowel");
		break;
		default:
			System.out.println("Its Consonant");
			break;
	}
}}

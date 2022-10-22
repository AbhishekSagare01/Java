package com.BasicPrograms;

public class SwappingOfNumbers {

	public static void main(String[] args) {

		//With help of temp variable
		int a=20;
		int b=30;
		int temp;
		
		System.out.println("BEFORE SWAPPING");
		System.out.println(a);
		System.out.println(b);
		
		//LOGIC
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("AFTER SWAPPING");
		System.out.println(a);
		System.out.println(b);
		
		//Without the help of temp variable;
		
		int c= 50;
		int d= 60;
		System.out.println("************$$$$$$$$$****************");
		System.out.println("BEFORE SWAPPING WITHOUT TEMP VARIABLE");
		System.out.println(c);
		System.out.println(d);
		
		//LOGIC
		c=c-d;
		d=c+d;
		c=d-c;
		
		System.out.println("AFTER SWAPPING WITHOUT TEMP VARIABLE");
		System.out.println(c);
		System.out.println(d);
		
		//System.out.println("************$$$$$$$$$****************");
		
		
		
	}

}

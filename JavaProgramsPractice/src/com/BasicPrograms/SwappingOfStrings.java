package com.BasicPrograms;

public class SwappingOfStrings {

	public static void main(String[] args) {
		
		
		System.out.println("************STRING SWAPPING WITH TEMP****************");
		
		String p= "ABHISHEK";
		String q="SAGARE";
		
		System.out.println("BEFORE SWAPPING OF STRING WITH TEMP VARIABLE");
		System.out.println(p);
		System.out.println(q);
		String temp2;
		
		//logic
		temp2=p;
		p=q;
		q=temp2;
		
		System.out.println("AFTER SWAPPING OF STRING WITH TEMP VARIABLE");
		System.out.println(p);
		System.out.println(q);
		
		
		System.out.println("************STRING SWAPPING WITH TEMP****************");
		
		String x= "VERSATILE";
		String y="QA ENGINEER";
		
		System.out.println("BEFORE SWAPPING OF STRING WITHOUT TEMP VARIABLE");
		System.out.println(x);
		System.out.println(y);
		
		
		//logic
		x=x+y;
		y=x.substring(0, x.length()-y.length());
		//System.out.println(x);
		
		x=x.substring(y.length());
		//System.out.println(y);
		
		
	
		
		System.out.println("AFTER SWAPPING OF STRING WITHOUT TEMP VARIABLE");
		System.out.println(x);
		System.out.println(y);

	}

}

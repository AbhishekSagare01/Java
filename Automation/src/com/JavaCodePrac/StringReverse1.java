package com.JavaCodePrac;

public class StringReverse1 {

	public static void main(String[] args) {
		
	 //String A = "Abhishek is best Automation Tester";
		 String A = "mom";
	 
	 StringBuilder obj= new StringBuilder ();
	 
	 obj.append(A);
	 obj=obj.reverse(); //As it is mutuable we can directly change it and value will be stored.
/*
 * String is immutable but String builder is mutable
 */
	//System.out.println(obj.append(A));
   	System.out.println(obj);
	
/*	for(int i =0; i<obj.length();i++)
	System.out.print(obj.charAt(i));*/

	
	/* StringBuffer obj=new StringBuffer("Abhishek is best Automation Tester");
	 
  System.out.println(obj.reverse());*/
	if (obj.equals(A)) {
		System.out.println("String is Palindrom");
	}else {
		System.out.println("String is not palindrome");
	}
   	
	}

}

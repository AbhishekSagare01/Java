package com.JavaCodePrac;

public class SwipewithoutTemp {

	public static void main(String[] args) {
		
	
	        String a = "Love";  
	        String b = "You";  
	        System.out.println(a.length());
	        System.out.println("Before swap: " + a + " " + b);  
	        a = a + b;  
	        b = a.substring(0, a.length() - b.length());  
	        a = a.substring(b.length());  
	        System.out.println("After : " + a + " " + b);  
	    }  
	

	}



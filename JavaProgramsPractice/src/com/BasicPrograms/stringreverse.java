package com.BasicPrograms;

public class stringreverse {
	
	public static void main(String[] args) {
		
		//without using string in built method

		String S= "Abhishek Sagare";
		
		char c [] =  S.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
		System.out.print(c[i]);
		}
		
		//using string buffer class
		StringBuffer sb = new StringBuffer ("Abhishek Sagare");
		
		sb.reverse();
		System.out.println();
		System.out.println(sb);
		
		
		
	}

}

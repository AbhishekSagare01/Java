package com.BasicPrograms;

public class HighestNumberOutOfThree {

	public static void main(String[] args) {
		
		int i=50;
		int j=40;
		int k=50;
		
		if(i>j && i>k) {
			
			System.out.println("i is the greatest number");
		}else if(j>k) {
			
			System.out.println("j is the greatest number");
		}else {
			
			System.out.println("k is the greatest number");
		}

		
		if(i>=j) {
			if(i>=k) {
				
				System.out.println("i is the greatest number");
			}else {
				
				System.out.println("k is the greatest number");
			}
		}else {
			
			if(j>=k) {
				System.out.println("j is the greatest number");
			}
		}
	}

}

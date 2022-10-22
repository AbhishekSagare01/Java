package com.BasicPrograms;

public class LeapYear {

	public static void main(String[] args) {

		int year=400;
		boolean flag=false;
		/*if (year%4==0) {
			if(year%100==0) {
				
				if(year%400==0) {
					
					flag = true;
				}else {
					flag= false;
				}
			}else {
				
			 flag=true;
			}
		} else {
			
			flag= false;
		}
	*/
		 if (year%4==0) {
			 
			 flag =true;
		 }
		 
		  if(year%100==0) {
			  flag=false;
		  }
		  
		  if (year%400==0) {
			  
			  flag=true;
		  }
	
		if(flag==true) {
			
			System.out.println(year +": Its leap year");
			
		}else {
			System.out.println(year +": Its not a leap year");
		}
	} 
	
	

}

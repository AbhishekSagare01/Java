package javaBasicsBrushup;

public class BasicsBrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare variables and Datatypes
		
		int num =1;
		String name= "BrushupPractice";
		char letter ='c';
		double decimal =15.59;
		boolean flag =true;
		
		System.out.println("number is " + num);
		System.out.println(name);
		
		//ARRAY declarations
	//	1.
		int a [] = new int [5];
		
		a[0] =1;
		a[1] =2;
		a[2] =3;
		a[3] =4;
		a[4] =5;
		
		
	//2.
		int [] b = new int [2];
		b[0] =1;
		b[1] =2;
	
	//3. 
		int [] c = {1,2,3,4,5};
		int d []  = {1,2,3,4,5};
		
		// to print single value of array
		System.out.println(c[2]);
		//To print all values of array use looping concept
		 for (int i = 0; i<a.length ;i++) {
			 System.out.println(a[i]);
		 }
			 //ADVANCED FOR LOOP
			 
			 for (int j :c) {
				 System.out.println("By advance for loop "+j);
			 }
		 }
	}



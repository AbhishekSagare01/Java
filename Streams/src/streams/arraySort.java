package streams;

import java.util.Arrays;

public class arraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,5,25,7,8,95,59};
	Arrays.sort(arr);
	System.out.println("Array "+ Arrays.toString(arr));	

	String[] arr1= {"X","B","z","a","D","A","C"};
	Arrays.sort(arr1);
	System.out.println("Array "+ Arrays.toString(arr1));	
	
	String s= "Abhishek Kailas Sagare";
	String s1[]= s.split(" ");
	//for(int i=0;i<s1.length;i++) 
	System.out.println(s1[0]);
	
	}

}

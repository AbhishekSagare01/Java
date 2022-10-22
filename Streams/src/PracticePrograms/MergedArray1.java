package PracticePrograms;

import java.util.Arrays;

public class MergedArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{  
			int[] firstArray = {56,78,90,32,67,12}; //initialized array  
			int[] secondArray = {11,14,9,5,2,23,15};  
			int length = firstArray.length + secondArray.length; //add the length of firstArray into secondArray  
			int[] mergedArray = new int[length];    //resultant array  
			int pos = 0;  
			for (int element : firstArray) //copying elements of secondArray using for-each loop  
			{  
			mergedArray[pos] = element;  
			pos++;              //increases position by 1  
			}  
			for (int element : secondArray) //copying elements of firstArray using for-each loop  
			{  
			mergedArray[pos] = element;  
			pos++;  
			}  
			System.out.println(Arrays.toString(mergedArray));   //prints the resultant array  
			}  
			}  
	}



package PracticePrograms;

import java.util.Arrays;

public class MergeArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] firstArray = {"a","b","c"}; //initialized array  
		String [] secondArray = {"a","b","c"}; //initialized array  
		
		int length = firstArray.length + secondArray.length; //add the length of firstArray into secondArray  
		String [] mergedArray = new String[length];    //resultant array  
		int pos = 0;  
		for (String element : firstArray) //copying elements of secondArray using for-each loop  
		{  
		mergedArray[pos] = element;  
		pos++;              //increases position by 1  
		}  
		for (String element : secondArray) //copying elements of firstArray using for-each loop  
		{  
		mergedArray[pos] = element;  
		pos++;  
		}  
		System.out.println(Arrays.toString(mergedArray));   //prints the resultant array  
		}  
		
	}


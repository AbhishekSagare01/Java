package com.JavaCodePrac;

public class LargeSmallinMultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int arr [] [] = {{1,4,5},{3,214,6},{115,8,10}};
		int large= arr[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if (arr[i][j]>large) {
				large=arr[i][j];
			}
			}
		}
		
		System.out.println(large);
	}

}

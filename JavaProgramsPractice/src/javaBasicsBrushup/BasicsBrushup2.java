package javaBasicsBrushup;

public class BasicsBrushup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int arr [] = {1,2,4,6,8,13,16,19,122};
		
		//multiple of 2 or print only 2
		
		for (int i=0;i<arr.length ; i++) {
			
			if(arr[i] % 2== 0) {
				System.out.println(arr[i]);
				//break;
			}
				else {
					
					System.out.println(arr[i]+" is not multiple of 2");
				}
				
			}
			
		}
	}



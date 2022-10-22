package JavaPractice;

import java.util.Arrays;

public class test1 {
	
	           public static int[] solution(int N) {
	        
	    int[] result = new int[N];
	
	    if(!(N%2==0)) {
	    for (int i = 1; i <=N/2; i++)
	     
	           result[i] = i  ;
	           
	    for (int i = 1; i <=N/2; i++)
	    	result[N-i] = -i  ;    
	 
		return result;
		
		}else 
			{
		    for (int i = 1; i <=N/2; i++)
			     
		           result[i-1] = i  ;
		           
		    for (int i = 1; i <=N/2; i++)
		    	result[N-i] = -i  ; }   
	    return result;
			
		}	
	    
	    public static void main(String[] args){
	        int[] output = solution(7);
	        
	          System.out.print(Arrays.toString(output)+ " ");

} }

package PracticePrograms;

import java.util.HashMap;
import java.util.Set;

public class duplicateElementInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//duplicateIntegers
		
		Integer [] numbers = new Integer[] {1,2,3,6,3,4,5,1,10,40};
		
		HashMap<Integer,Integer> hs = new HashMap<Integer,Integer>();
		
		for(int i: numbers) {
			
			if(hs.containsKey(i)) {
				
				hs.put(i, hs.get(i)+1);
			}else {
				
				hs.put(i,1);
			}
			
			
		}System.out.println(hs);
       // this is to print duplicate strings min value is 2  
		Set<Integer> num =hs.keySet();
		for(int j:num) {
		if(hs.get(j)>1) {
			
			System.out.println(j +": "+ hs.get(j));
		}
		}
	}



	}



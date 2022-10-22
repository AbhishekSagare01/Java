package PracticePrograms;

import java.util.HashMap;
import java.util.Set;

public class duplicateElementCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S= "Hey Java is Java Best language is Java";
		
		String[] words = S.split(" ");
		
		HashMap<String,Integer> hs = new HashMap<String,Integer>();
		
		for(String i: words) {
			
			if(hs.containsKey(i)) {
				
				hs.put(i, hs.get(i)+1);
			}else {
				
				hs.put(i,1);
			}
			
			
		}System.out.println(hs);
		
		 Set <String> wordstring =hs.keySet();
       // this is to print duplicate strings min value is 2  
		for(String j:wordstring) {
		if(hs.get(j)>=1) {
			
			System.out.print(" "+j);
			//System.out.println(j+": "+hs.get(j));
			
		}
		}
	}

}

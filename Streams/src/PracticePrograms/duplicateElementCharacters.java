package PracticePrograms;

import java.util.HashMap;
import java.util.Set;

public class duplicateElementCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String S="abcdebabcezf";
		char []c = S.toCharArray();
		HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
		
		for(char i: c) {
			
			if(hs.containsKey(i)) {
				
				hs.put(i, hs.get(i)+1);
			}else {
				
				hs.put(i,1);
			}
			
			
		}System.out.println(hs);
       // this is to print duplicate strings min value is 2  or equal to 1
		Set<Character> ch = hs.keySet();
		for(char j:ch) {
		if(hs.get(j)<2) {
			
			System.out.println(j+": "+hs.get(j));
		}
		}
	}

	}



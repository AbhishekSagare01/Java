package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = "AdbcdedA";
		 // String inputStr ="teeter"

				    for(char j :S.toCharArray()){
				    if ( S.indexOf(j) == S.lastIndexOf(j)) {
				        System.out.println("First non-repeating character is: "+j);
				        break;
				    }
        char a [] = S.toCharArray();

		
		HashMap <Character, Integer> hs = new HashMap <Character, Integer> ();
		
	for(char c:a) {
			
		 if (hs.containsKey(c)) {
				 
				 hs.put(c, hs.get(c)+1);
			 }
			 
			 else {
				 
				 hs.put(c, 1);
		 }
	} System.out.println(hs);
	
     for(int i=0;i<a.length;i++) {
    	 
           if(hs.get(a[i])==1) {
        	   
        	   System.out.println(("" +a[i]));
           }
     }
	
	}
	
  
		
		

	}}



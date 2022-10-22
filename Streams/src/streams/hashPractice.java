package streams;

import java.util.HashMap;
import java.util.Hashtable;

public class hashPractice {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Character,Integer> hs = new HashMap<Character,Integer>();
	    hs.put('C', 1);
	    hs.put('C', 2);
	  System.out.println("hashmap "+hs);
	  Hashtable<Character, Integer> hs1 = new Hashtable<Character, Integer>();
	  hs1.put('D', 1);
	
	hs1.put('D', 2);
	System.out.println(hs1);
	}

}

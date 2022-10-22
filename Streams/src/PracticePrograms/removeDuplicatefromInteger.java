package PracticePrograms;

import java.util.LinkedHashSet;

public class removeDuplicatefromInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="123124456";
		char[]b= a.toCharArray();
		LinkedHashSet<Character> set    = new LinkedHashSet<Character>(); 
		for (int i = 0; i < b.length; i++) {
		    set.add(b[i]);
		}System.out.print(set);
		
		System.out.println();
		for(char j:set) {
			
			 System.out.print(" "+j);
		}
	}

}

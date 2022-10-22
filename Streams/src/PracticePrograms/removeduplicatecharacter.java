package PracticePrograms;

import java.util.LinkedHashSet;

public class removeduplicatecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="abcdrtfjhiabcde";
		char[]b= a.toCharArray();
		LinkedHashSet<Character> set    = new LinkedHashSet<Character>(); 
		for (int i = 0; i < b.length; i++)
		    set.add(b[i]);
		
		System.out.print(set);

	}

}

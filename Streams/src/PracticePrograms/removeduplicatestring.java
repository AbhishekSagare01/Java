package PracticePrograms;

import java.util.LinkedHashSet;

public class removeduplicatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="Hey Java is Java Best language is Java";
		
	    String [] b= a.split(" ");
	LinkedHashSet<String> set = new LinkedHashSet<String>();
	     
// adding elements to LinkedHashSet
         for (int i = 0; i < b.length; i++) {
              set.add(b[i]);


         }  System.out.print(set);
         System.out.println();
         for(String i: set) {
        	 
        	 System.out.print(" "+i);
         }
          // Print the elements of LinkedHashSet
	}

}

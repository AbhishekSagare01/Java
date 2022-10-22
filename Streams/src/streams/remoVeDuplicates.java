package streams;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class remoVeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Works for both integer as well as string
		String a ="ABchdeejKAA";
		    char[] b= a.toCharArray();
		LinkedHashSet<Character> set
        = new LinkedHashSet<Character>();
            
    // adding elements to LinkedHashSet
    for (int i = 0; i < b.length; i++)
        set.add(b[i]);

    // Print the elements of LinkedHashSet
 
    System.out.print(set);
  
	}

}

package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class duplicatElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer> ls = Arrays.asList(1,2,3,10,2,2,5,6,1,3,3);
		// duplicate>>if you use toList instead of toSet then it will give you list of all repeated numbers
		Set<Integer> dup=     ls.stream().filter(s->Collections.frequency(ls,s)>1).collect(Collectors.toSet());
		
		System.out.println(dup);
		// sort in ascending
		 List <Integer> ls1 =    ls.stream().sorted().collect(Collectors.toList());
		 System.out.println(ls1);
		 
		 // sort in descending
		  List<Integer> desc=   ls.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		 System.out.println(desc);                     
		
		List <String> sr = Arrays.asList("ab","c","as","ab","cd","as","ab","abhi");
		// duplicate in string
		Set<String> dup1=     sr.stream().filter(d->Collections.frequency(sr,d)>1).collect(Collectors.toSet());
		
		System.out.println(dup1);
		//sorting in ascending 
		             List<String>sr1  =   sr.stream().sorted().collect(Collectors.toList());
		             System.out.println(sr1);
		
	
		     

	}

}

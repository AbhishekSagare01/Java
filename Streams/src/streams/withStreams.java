package streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class withStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList <String> al = new ArrayList <String> ();
		
		al.add("Abhi");
		al.add("ABD");
		al.add("Ananya");
		al.add("Bob");
		al.add("John");
		
		  /*1. Converted arraylist to stream () first
		  2. Then by filter and lambda expression and startsWith method  we get the count
		  3. There is no life for intermediate operation if there is no terminal operation
		  4.Terminal operation will execute only if intermediate operation (filter) returns true
		  5.We can create Stream
		  */
		
		
		long Count= al.stream().filter(a->a.startsWith("B")).count(); 
		
		System.out.println(Count);
		
		/*You can directly convert all value to Stream by Stream.Of*/
		
		 long d=Stream.of("Abhi","ABD","Ananya","Bob","John").filter(j-> {
			 
			 return j.startsWith("A");
			  
		 }).count();
		 System.out.println(d);
	}

}

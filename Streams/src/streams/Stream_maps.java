package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_maps {

	public static void main(String[] args) {
		// Map to upper case and print it

		
		Stream.of("Abhijeet","Abhishek","Don","Rama","Nitesh","ananya")
		.filter(s->s.endsWith("a"))
		.map(s->s.toUpperCase())
		.forEach(s-> System.out.println(s));
		System.out.println("******************");
		
		//Sorting the array by predefined method in ascending order
		
		List<Integer> num=Arrays.asList(11,8,5,6,8,9);
		num.stream().sorted().forEach(z->System.out.println(z));
		System.out.println("******************");
		//distinct number from given array
		num.stream().distinct().forEach(s->System.out.println(s));
		
		// print names which have first letter as a with uppercase and sorted
		
		List<String> ls=Arrays.asList("Azbhijeet","Abhishek","Don","Rama","Nitesh","ananya"); //convert to list
		ls.stream().filter(s->s.startsWith("A")).sorted().map(a->a.toUpperCase()).forEach(s->System.out.println(s));
		
		 
	}

}

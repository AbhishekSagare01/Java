package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class collectstream {

	public static void main(String[] args) {
		// Collect the streams
		
		List<String> ls= Stream.of("Abhi","Rama","Niraj","Krishna").filter(s->s.endsWith("a"))
				.map(s->s.toUpperCase()).collect(Collectors.toList()); //it will collect and store in list
		
		System.out.println(ls.get(0));
		System.out.println(ls.get(1));
		

	}

}

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Merge {

	public static void main(String[] args) {
		// add streams into each other
		
		List<String> ls=Arrays.asList("Abhijeet","Abhishek","Don");
		
		// Remember here name entered are also case sensitive
		List<String> ls2=Arrays.asList("Rama","Nitesh","Ananya");
		
		Stream <String> st =Stream.concat(ls.stream(),ls2.stream());
		st.sorted().forEach(a->System.out.println(a));
	//Match will return condition whether it is true or false whereas filter will help to take actions on required stream
		boolean flag=st.anyMatch(s->s.equalsIgnoreCase("don"));
		System.out.println(flag); // to get this as output comment out above sorted operation
	}

}

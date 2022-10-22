package streams;

import java.util.ArrayList;

public class stream_basics {

	public static void main(String[] args) {
		
		
ArrayList <String> al = new ArrayList <String> ();
		
		al.add("Abhi");
		al.add("ABD");
		al.add("Ananya");
		al.add("Bob");
		al.add("John");
		// print all names of arraylist whose character is greater than 3
		al.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));
		System.out.println("********Use of LIMIT***********");
		al.stream().filter(a->a.length()>3).limit(1).forEach(s->System.out.println(s));

}}

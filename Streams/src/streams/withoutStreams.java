package streams;

import java.util.ArrayList;

public class withoutStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> al = new ArrayList <String> ();
		
		al.add("Abhi");
		al.add("ABD");
		al.add("Ananya");
		al.add("Bob");
		al.add("John");
		
		int count =0;
	
		for (int i =0;i<al.size();i++)
		{
			String name=al.get(i);
			
				if(name.startsWith("A")){
					
					count++;
					}
		}
		
		System.out.println(count);
		
		
		
	
	}

}

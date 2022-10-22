import java.util.HashMap;

public class TestNetcore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "ana" ;
		 char [] a = input.toCharArray();
		HashMap <Character,Integer> hs = new HashMap <Character,Integer>();
		
		for (char i: a) {
			
			if(hs.containsKey(i)) {
				
				hs.put(i, hs.get(i)+1);
			}else {
				
				hs.put(i, 1);
			}
		} System.out.println(hs);
		

	}

}

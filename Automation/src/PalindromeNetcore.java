
public class PalindromeNetcore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		 String s ="ana";
		 
		 StringBuffer Sb = new StringBuffer (s);
		 
		  String rev = Sb.reverse().toString();
		  
		//  System.out.println(rev);
		  
		  if (s.equals(rev)) {
			  
			 System.out.println("Palindrome");
		  }else {
			  
			  System.out.println("not Palindrome");
		  }
		  
		
		
	}

}

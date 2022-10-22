package streams;

public class PalindromeAdvance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java Program to count palindrome substring
	
		// Declare and initialize the string   akbrarjb
		String str = "abbaeae";
		// Call the method
		System.out.println(countPS(str));
	} 
			
			// Method which return count palindrome substring
			static int countPS(String str){
				String temp = "";
				StringBuffer stf;
				int count = 0;
				// Iterate the loop twice
				for (int i = 0; i < str.length(); i++) {
					for (int j = i + 1; j <= str.length(); j++) {
						// Get each substring
						temp = str.substring(i, j);
						
						// If length is greater than or equal to two
						// Check for palindrome	
						if (temp.length() >= 2) {
							// Use StringBuffer class to reverse the string
							stf = new StringBuffer(temp);
							stf.reverse();
							// Compare substring with reverse of substring
							if (stf.toString().equals(temp))
								{count++;
								}
								}
						//System.out.println(stf);
						
						}
					}
				
				// return the count
				return count;//count;
			}
			
			
}	

	



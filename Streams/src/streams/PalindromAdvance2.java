package streams;

public class PalindromAdvance2 {

	public static void main(String[] args) {
		String str = "abbaeae";
		// Call the method
		System.out.println(countPS(str));
	} 
			
			// Method which return count palindrome substring
			static int countPS(String str){
				String temp = "";
				StringBuffer stf=null;
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
								int len = temp.length();
								System.out.println(stf);
					
								if(stf.length()>len) {
									int newlen = len;
									System.out.println(newlen);
								}
								
								}
								}
						
						
						}
					}
				
				// return the count
				return count;//count;

	}

}

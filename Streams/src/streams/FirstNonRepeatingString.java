package streams;

public class FirstNonRepeatingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String S ="abcda";
		
	 /*for(char j :S.toCharArray()){
			    if ( S.indexOf(j) == S.lastIndexOf(j)) {
			        System.out.println("First non-repeating character is: "+j);
			        break;*/
			  //  }
		 char a[] =S.toCharArray();
		 
		  System.out.println(a);
			    for(char i=0;i<S.length();i++){
				    if (S.indexOf(a[i])==S.lastIndexOf(a[i])) {
				        System.out.println("First non-repeating character is: "+a[i]);
				        break;
	}}}}



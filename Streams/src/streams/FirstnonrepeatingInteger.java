package streams;



public class FirstnonrepeatingInteger {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int s=123121;
		 String s1 = String.valueOf(s);
		 char ch[]=s1.toCharArray();
	//	 System.out.println(ch);
		  for(char j=0;j<s1.length();j++){
			    if (s1.indexOf(ch[j])==s1.lastIndexOf(ch[j])) {
			        System.out.println("First non-repeating character is: "+ch[j]);
			        break;
			    }
       
	}
	}}

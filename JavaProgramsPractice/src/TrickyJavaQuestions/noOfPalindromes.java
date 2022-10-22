package TrickyJavaQuestions;

public class noOfPalindromes {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pali [] = {"Abhishek","BNBNB","ABA"};
		int count =0;
		for (int i=0;i< pali.length;i++)
		{
			String reverse = new StringBuffer(pali[i]).reverse().toString();
			
			if (reverse.equals(pali[i])) {
				
				 count++;
				System.out.println(reverse); 
				
			
				}
				 
			}System.out.println(count);
			
		}
		
	}
	



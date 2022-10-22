package TrickyJavaQuestions;

public class Oneto100withoutusingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//method-1
		int one = 'A'/'A'; //1
		String s1 ="..........";
		
		for(int i= one;i<=s1.length()*s1.length();i++)
		{
			System.out.println(i);
		}
       //method-2
		//ASCI a-97,b-98,c-99,d-100
		for(int i=1;i<='d';i++)
       {
    	   System.out.println(i);
       }
}}

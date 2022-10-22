package TrickyJavaQuestions;

public class stringReversewithSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S="Abhishek";
		char a[] = S.toCharArray();
		
		System.out.println(a);
		
		for (int i=a.length-1;i>=0;i--)
		{
			System.out.print(" "+a[i]);
		}
				
	}

}

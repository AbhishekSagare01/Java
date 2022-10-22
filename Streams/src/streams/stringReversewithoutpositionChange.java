package streams;

public class stringReversewithoutpositionChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = "Abhishek is good guy";
		String reverse ="";
		String [] arr= S.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				System.out.print(arr[i].charAt(j));
				// reverse = reverse+arr[i].charAt(j) ;
			}
			System.out.print(" ");
		//	System.out.print(reverse + " ");
			//reverse ="";                   
			
		}

	}

}

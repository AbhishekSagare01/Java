package PracticePrograms;

public class firstNonrepeatingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S ="Sb Sd Sb Sc Sp Sb Sd";
		
		//char[] arr = S.toCharArray();
		String [] arr = S.split(" ");
		for (char i=0;i<S.length();i++) {
			
			if(S.indexOf(arr[i])==S.lastIndexOf(arr[i])) {
				
				System.out.println(arr[i]);
				break;
			}
			
				
				
		
			
		}

	}

}

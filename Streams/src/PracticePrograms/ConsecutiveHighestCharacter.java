package PracticePrograms;

public class ConsecutiveHighestCharacter {

	public static void main(String[] args) {
		
	       //  String S = "abbaadccc";
		           String S = "abbcdaaaaccddd";
	         int len = S.length();
	         int count =0;
	         char res=S.charAt(0);
	         for(int i = 0;i<len;i++) 
	         {
	        	 int newCount =1;
	        	for (int j=i+1;j<len;j++) {
	        		
	        		{
	        			if(S.charAt(i)!=S.charAt(j)) 
	        			break;
	        			 newCount++;
	        			 	
	        		} }
	        	          if(newCount>count) {
	        	        	  
	        	        	  count = newCount;
	        	        	  res= S.charAt(i);	
	        		}
	        	}
	        System.out.println("Highest consecutive = " + res +": " + count);
	        	
	         }

	}



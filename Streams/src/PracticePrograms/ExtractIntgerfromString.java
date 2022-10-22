package PracticePrograms;

public class ExtractIntgerfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num ="";
		String Sd="";
        String S = "ABC123D4590";
        char [] a = S.toCharArray();
        for(int i= 0;i<S.length();i++){
            
            // if //(a[i] -'0'>= 0 && a[i]-'0' <= 9) 
              if((a[i] >= '0' && a[i] <= '9')){
                // System.out.println(a[i]);
              num =num+ S.charAt(i);
               //  System.out.println(a[i]);
                 
             }else {
            	 
            	 Sd = Sd+ S.charAt(i);
            	//  Sd = String.valueOf(a[i]).toString();
            	  //System.out.println(a[i]);
            	
             }
        } System.out.println(num);
        System.out.println(Sd);
	}

}

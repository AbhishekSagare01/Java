package PracticePrograms;

public class StringNumberExtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "ABCDd123bc123509afhz";
		
		String num ="";
		String word="";
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				
				num = num+ s.charAt(i);
			}else  {
				
				word=word+s.charAt(i);
			}
			
		}
                 System.out.println("Numbers are " + num );
                 System.out.println("Charcters are "+ word);
	}

}

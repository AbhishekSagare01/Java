package JavaPractice;

public class throwNewException {

	public static void main(String[] args) {

		
		System.out.println("ABC");
		
		try {
			throw new Exception("Abhishek Exception");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("XYZ");

	}
	
}

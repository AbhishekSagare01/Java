package JavaPractice;

public class MethodOverloadingPrac {

	public void Mobile() {
	
		System.out.println("SamSung");
	}
	
	public void Mobile(int j) {
		
		System.out.println("Apple");
	}
	
	public void Mobile(int i,int k) {
		
		System.out.println("Nokia");
	}
	
	public static void main(String[] args) {
		
		MethodOverloadingPrac obj = new MethodOverloadingPrac();
		
		obj.Mobile();
		obj.Mobile(5);
		obj.Mobile(2, 3);
		obj.main();

	}
	
	//Main method overloading
	public void main() {
		System.out.println("Integer");
}
	
	/*public void main(int j) {
		
		System.out.println("String");
	}
	*/
	
	 
	    void main(int args)
	    {
	        System.out.println("Another main method");
	    }
	 
	    double main(int i, double d)
	    {
	        System.out.println("Another main method");
	 
	        return d;
	    }
	
	
}

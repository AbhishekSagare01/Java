package JavaPractice;

public class GlobalVsLocal {
	
	int price;    // Non Static Global Variable
	static	String mobile="Samsung";  //Static Global Variable
	
	public static void main(String[] args) {
		
		//***** Calling Static global variable inside Static method ***** 
		
		// 1.By Class name directly
		// 2.By direct name
		System.out.println("Static inside Static method by class name = " + GlobalVsLocal.mobile);
		mobile="A71";
		System.out.println("Static inside Static method by direct calling = " + mobile);
		
		
		//***** Calling NonStatic Global variable inside Static method ***** 
		//1. Create Object to call non static method/variable
		
		GlobalVsLocal obj = new GlobalVsLocal();
		
		obj.price=50000;
		System.out.println("non Static inside Static method = "+ obj.price);
	}

}

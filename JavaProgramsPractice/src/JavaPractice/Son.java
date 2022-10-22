package JavaPractice;

public class Son extends Father {
	
	public Son()
	{
		//super(5,10);
		System.out.println("Inside Son Constructor");
	}
	
	
	public Son(int k)
	{
		//super(); //irrespective of super keyword by default the parent constructor will be called
		System.out.println("Inside Single param Son constructor ");
	}
	
//	public static void main(String args[]) 
//	{
//	   Son s=new Son(5);	
//	   Son s1=new Son();
		
	}
	

//}

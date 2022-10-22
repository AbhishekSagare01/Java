package JavaPractice;

public class ConstructorPractice{
	
	int sal;
	String Name;
	

	public ConstructorPractice() 
	{
	
		System.out.println("I am Inside Default Constructor");	
	}
	
	public ConstructorPractice(int i)
	{
		//this();
	
		//System.out.println(j);
		System.out.println("I am inside single paramaterized Constructor");
	}
	
	
	//Use of this keyword: Use to initialize the global variable with current value
	
	public ConstructorPractice(int sal,String name) 
	{
		//this(5);
		System.out.println("I am inside double paramaterized Constructor");
		
		this.Name=name;
		Name=name;
		this.sal=sal;
		
		System.out.println("Employee name is "+name+ " and Salary is "+ sal);
	}
	public static void main(String[] args) 
	
	{
		
			ConstructorPractice c=new ConstructorPractice();
			ConstructorPractice c1=new ConstructorPractice(5);
			ConstructorPractice c2=new ConstructorPractice(50000,"Abhishek");
	}


}

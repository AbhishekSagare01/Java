package JavaPractice;

public class ConstructorConcept {

	int result;
	
	private ConstructorConcept() {
		
		System.out.println("Private constructore");
	}
	
	public ConstructorConcept(int Mark)
	{
		result=Mark;
		System.out.println("This is Constructor");
	}
	
		public void display()
	
	{
			//Constructor can be called in method as well but if you declare constructor as private you can't call it outside the class
		ConstructorConcept C=new ConstructorConcept();  
		System.out.println("Result is "+ result);
	}

	
	public static void main(String[] args) {
		
	ConstructorConcept obj = new ConstructorConcept(99);
	
	obj.display();
		
	
		
		
		
	}

}

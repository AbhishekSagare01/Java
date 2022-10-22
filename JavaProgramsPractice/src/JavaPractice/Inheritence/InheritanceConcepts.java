package JavaPractice.Inheritence;

public class InheritanceConcepts {

	public static void main(String[] args) {
		
		
		Laptop l= new Laptop();
		Laptop_HP hp=new Laptop_HP();
		Laptop_Dell d= new Laptop_Dell();
		Laptop l2= new Laptop_Dell();
		
		
		l.Operating_system();
		l.RAM();
		l.processor();
		
	
		System.out.println("********************************");
		
		hp.Operating_system();
		hp.RAM();
		hp.processor();
		
		System.out.println("********************************");
		
		d.Operating_system();
		d.RAM();
		d.processor();

		System.out.println("********************************");
		
		l2.Operating_system();
		l2.RAM();
		l2.processor();
		
	}

}

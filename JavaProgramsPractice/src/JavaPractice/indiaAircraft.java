package JavaPractice;

public class indiaAircraft extends aircraftMaintance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		aircraftMaintance am =new indiaAircraft();
		indiaAircraft I= new indiaAircraft();
		am.color();
		am.MaintanceRule();
		am.engine(); //calls child method similar to inheritance-->>Runtime Polymorphism
		I.color();
		I.MaintanceRule();
		I.engine(); //calls child method  
		

	}
	
	public void engine()
	{
		System.out.println("India Engines");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Blue Colour");
	}

}

package JavaPractice;

public class IIBsTest {

	int i;
	 
	//Instance Initialization Block
	
    {
        i = 10;
    }

    {
        System.out.println("First IIB Block");
   }

   {
        System.out.println("Second IIB Block");
   }
    

    IIBsTest(int j)
    {
    	   this();
       i = j;
    	
    
        System.out.println("First Constructor");
    }
	

	IIBsTest()
{
     System.out.println("Second Constructor");
}
}
     
     
     
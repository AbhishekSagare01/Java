class pracitce{

    public static void main (String args []){

        System.out.println("Hello");

        pracitce obj = new pracitce();
        int d =obj.practiceMethod();
        System.out.println(d);
            
    }

    public  int  practiceMethod()
    {
        System.out.println("Inside Method");
        int x =20;
        int y=30;
        int z = x+y;
        return z;

        
    }

}
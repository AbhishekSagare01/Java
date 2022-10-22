class abc {

    static int i;
    static String name;
    static {
         i =2;
         name ="abhishek";
        System.out.println(i+" "+name);
    }
    public static void main(String[] args) {
        int j=10;
        System.out.println("after static" );
        System.out.println(j);
    }
    }

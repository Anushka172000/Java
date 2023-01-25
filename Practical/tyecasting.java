class typecasting {
    public void tye()
    {
        double a=5678.90;
        int b=67;
        System.out.println(a); //narrowing
         int c =(int)a; 
        System.out.println(b);// widening
        System.out.println(c);

    }
    public static void  main(String args[])
    {
        typecasting tc= new typecasting();
        tc.tye();
    }
}

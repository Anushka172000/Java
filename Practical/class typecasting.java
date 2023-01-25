class typecasting 
{
public void typecasting()
{
      double a=67589.98;
    int b=56;
   // System.out.println((a)); // narrowing
  ///  System.out.println(b);
}
public static void main(String args[])
{
 typecasting tc=new typecasting();
 tc.typecasting();
 System.out.println("the widening"+(tc.a));
 System.out.println("the narrowing"+(tc.b));
}
}

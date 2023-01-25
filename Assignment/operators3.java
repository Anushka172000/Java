class operators3
{
public  void arthimetic()
{
 int a=10;
int b=20;
System.out.println("Addition "+(a+b));
System.out.println("Subtraction "+(a-b));
System.out.println("Divsion "+(a/b));
System.out.println("Mutiple "+(a*b));
System.out.println("Modulo "+(a%b));
System.out.println("increment"+(a++));
System.out.println("increment"+(b++));
}
public void logical()
{
    int a=34;
    int b=55;
    System.out.println("and operators "+(a<b && b<a));
    System.out.println("or operators "+(a<b || b<a));
    System.out.println(" not operators "+(!(a<b && b<a)));

}
public void comparsion(){
  int  a=7;
  int  b=10;
    System.out.println(a>b);
    System.out.println(a<b);
    System.out.println(a==b);
    System.out.println(a<=b);
    System.out.println(a!=b);
    System.out.println(a>=b);
}
public void assignment(){
  int x=67;
  int y=34;
  System.out.println(x);
  System.out.println(x+=6);
  System.out.println(y*=5);
  System.out.println(x%=7);
  System.out.println(x^3);
  System.out.println(x&y);
}
public void Urnary()
{
 int a=60;
 int b=78;
System.out.println("Increment "+(a++));
System.out.println(++a);
System.out.println(++b);
System.out.println(b++);
System.out.println(b++);
System.out.println("Decrement "+(b--));
System.out.println(--a);
System.out.println(b--);
System.out.println(--b);
System.out.println(b--);
}
public void ternary(){
  	int a = 19;
		int b = 20;
		int c = (a > b)? a : b; //displays the value of a if a is greater than b else displays value of b
		System.out.println(c); //prints the value of c
	}
	
	
public static void main(String args[])
{
operators3 ar = new operators3();
ar.arthimetic();
ar.logical();
ar.comparsion();
ar.assignment();
ar.Urnary();
ar.ternary();
}
}

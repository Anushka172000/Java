class variableExample 
{
static int num=55; // static
long num1=54321908;// instance
public void display()
{
char a='A'; //local
double num2= 45.43;
System.out.println("local variable value:" +a);
System.out.println("local variable value:"+num2);
}

public static void calc()
{
double b=99.56;
double c=45.23;
double res=b*c;
System.out.println("Result is:" +res);
}
public  static void main(String args[])
{
variableExample obj=new variableExample();//object creation
obj.display(); //invoke nonstatic method with obj
calc();
System.out.println("Instance Variable value:" +obj.num1); //calling instance variable 
System.out.println("Static Variable value:" + num);
} 
}
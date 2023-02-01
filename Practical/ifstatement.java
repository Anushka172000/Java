import java.util.Scanner;
 //import java packages util
class ifstatement
{
public void calu(int x,int y)//non static method
{

if(x>y)
{
System.out.println("x is greater than y");

}
else
{
System.out.println("y is greater than x");
}
}
public static void main(String args[])
{
    ifstatement si = new ifstatement();
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number 1");
    int x =sc.nextInt();
    System.out.println("Enter the number 2");
    int y =sc.nextInt();
    si.calu(x, y);


}
}
import java.util.Scanner; // package util is use for Scanner for object
class SwitchCase // class created
{
   

    public void cacul( char operator,int num1 ,int num2)
    { // method create

    
    switch(operator)
    {
    case'+':
    System.out.println (num1 + num2); // operators is use "+"
    break;
    
  case '-':
 System.out.println( num1 - num2);  // operators is use "-"
 break;
 
 case '*':
 System.out.println( num1 * num2);  // operators is use "*"
 break;
 case '/': 
 System.out.println( num1 / num2);  // operators is use "/"
 break;
 
default:

System.out.println("invaild operator"); // default is if case is not match or choice is not use properly
    break;
    
    }
}
    
 public static void main(String args[])
 {
    SwitchCase sw=new SwitchCase();
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the your operator");
 char operator=sc.next().charAt(0);
 System.out.println("enter the first number");
   int num1=sc.nextInt();
   System.out.println("enter the your second ");
int num2=sc.nextInt();
sw.cacul( operator,num1, num2);
 

}
}
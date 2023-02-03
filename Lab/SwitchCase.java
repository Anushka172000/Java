import java.util.Scanner; // package util is use for Scanner for object
class SwitchCase // class created
{
   

    public void cacul( char operator,int num1 ,int num2) // parameter
    { // method create

    
    switch(operator)
    {
    case'+': // create cases to choose by user according their choices
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
 break; // break use to jump other case
 
default: // default use type invalid or error

System.out.println("invaild operator"); // default is if case is not match or choice is not use properly
    break;
    
    }
}
    
 public static void main(String args[]) // main method 
 {
    SwitchCase sw=new SwitchCase(); // object creation
    Scanner sc =new Scanner(System.in);// Scanner use to take user input and read by Scanner
    System.out.println("Enter the your operator");
 char operator=sc.next().charAt(0); // using this take input and charAt is use what in that 0 index store 
 System.out.println("enter the first number"); // taking input 
   int num1=sc.nextInt();// taking input is store in Int only that why we use nextInt()
   System.out.println("enter the your second ");
int num2=sc.nextInt();
sw.cacul( operator,num1, num2);//calling method using creating object
 

}
}
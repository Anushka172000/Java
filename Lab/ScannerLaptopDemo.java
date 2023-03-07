import java.util.Scanner; // import Scanner classs to take input form user 
class ScannerLaptopDemo{ // class name
    public static void main(String args[]){ // main entry of program
        int enter;
        Scanner sc = new Scanner(System.in); //create Scanner to take input from user 
        //System.out.println("Enter the your number"); // getting input of number

         // nextint is use to store int value from user 
       
     
   do { // do while loop
    
    System.out.println("1 ADD");
    System.out.println("2 Subtract");
    System.out.println("3 Mutilple");
    System.out.println("4 Even");
    System.out.println("Enter the your number");
    enter= sc.nextInt();

       
           
     switch (enter) {  // swtich case is bascially working according to the user input 
        case 1:
            System.out.println("Enter the first  number"); // ask the enter the number first 
            int a =sc.nextInt();
            System.out.println("Enter the Second number"); //ask the enter the number Second
            int b =sc.nextInt();
            System.out.println("Result "+(a+b)); // result will calculated after taking first and second number
            break;
     case 2:
     System.out.println("Enter the first second number"); // ask the enter the number first 
     int c =sc.nextInt();
     System.out.println("Enter the Second  number"); //ask the enter the number Second
     int e =sc.nextInt();
     System.out.println("Result "+(c-e));// result will calculated after taking first and second number
     break;
   case 3:
   System.out.println("Enter the first second number"); // ask the enter the number first 
     int E =sc.nextInt();
     System.out.println("Enter the Second  number"); // ask the enter the number second 
     int R =sc.nextInt();
     System.out.println("Result "+(E*R));// result will calculated after taking first and second number
     break;
  case 4:
  System.out.println("Enter the number"); //ask the enter the number 
     int s =sc.nextInt();
          
    if(s%2==0){ // condition if the number is even or odd
System.out.println("the number is even "+s ); //print the result
    }
else{
    System.out.println("the number is odd "+s); //if the condtion is false then print will peint odd number
}
break; // break statement the break statement 
case 5:
System.out.println("The Exist Program"); // if user enter 5  want to exist program 
break;
default: // default is use if any choices is not match 
        System.out.println("invalid "); //if input invalid or error
            break; 
           
}
}
 while (enter != 5); // conditon loop until will till user do want 
sc.close();
    
     

}
}



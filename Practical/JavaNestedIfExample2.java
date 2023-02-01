import java.util.Scanner;
class JavaNestedIfExample2
{
public void JavaNestedIfExample2 (int age,int weight)    
{      
    //Creating two variables for age and weight    
   // int age;   
   // int weight;      
    //applying condition on age and weight    
    if(age>=18){      
        if(weight>50){    
            System.out.println("You are eligible to donate blood");    
        } else{  
            System.out.println("You are not eligible to donate blood");    
        }  
    } else{  
      System.out.println("Age must be greater than 18");  
    } 
}
    public static void main(String[] args)
    {
        
    JavaNestedIfExample2 jf =new JavaNestedIfExample2();
    Scanner sc=new  Scanner(System.in);
    System.out.println("Enter the your age");
   int age =sc.nextInt();
  System.out.println("Enter the your weight");
  int weight=sc.nextInt();
  jf.JavaNestedIfExample2( age,weight);
}
}
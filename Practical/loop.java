import java.io.InputStream;
import java.util.Scanner;
class loop
{
    public void calcutable(int number)
    {
        int i;
        for( i=0 ;i<=10;i++)
        System.out.println(number+"x"+i+" " +(number-i));
    }
    public static void main (String args[])
    {
        loop Ip=new loop();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
       int number=sc.nextInt();
       Ip.calcutable(number);

    }
    
    
    
        
    }


    


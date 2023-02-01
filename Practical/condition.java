import java.util.Scanner;
class condition
{                               // else if ladder
    public void ae(int age)
    {
        if(age>=18)
        {
            System.out.println("Adults");            
        }
    else if(age>=60&&age>=100)
    {
        System.out.println("senoir citizens ");
    }
    else if(age>=50 &&age>=40){
System.out.println("junoir citizens");
    }
    else
    {
        System.out.println("kids");
    }
    }
    public static void main(String args[]){
    condition cd=new condition();
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    cd.ae(age);
    }
}
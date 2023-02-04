import java.util.Scanner;
class Diamond
{
    public void cacu(int input)
    {
        for(int i=1;i<input;i++){
            for(int j=i;j<=input;j++){
                System.out.print("  ");
            }
            for(int j=1;j<i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
   
        for(int i=1;i<=input;i++){
        for(int j=1;j<=i;j++){
            System.out.print("  ");
        }
        for(int j=i;j<input;j++){
            System.out.print("* ");
        }
        for(int j=i;j<=input;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
    public static void  main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the your number");
      int  input= sc.nextInt();
        Diamond db=new Diamond();
        db.cacu(input);
    }
}

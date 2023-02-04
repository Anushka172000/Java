
class adfc{    // create class
    public void cau()
    
{


    int i, j, n =5 ; 
    for (i = 1; i <= n; i++) //loop using for print repeately characters
    {
        int ch = 65; // ASCII the value 65 represents the letter A.
            for (j =1; j<=n-i+1; j++)
            {
                System.out.print((char)(j+64) + "  "); //ASCII the value 64 
            }
        System.out.print("\n"); // this used for print in next line
    }
}
public static void main(String args[]) // main method
{
adfc  ad= new adfc(); // object creation
ad.cau(); // invoking calling the method
}
} // class body


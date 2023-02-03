class eodd // class created
{
    public void sen(int sum) // parameter and method created
    {
        int i; 
        for(i=1;i<=200;i++){ // loop using repeating 
            sum =sum + i; // sum of natural number
            if(i%2==0){ // to find even number 
                System.out.println("the even"+i); // this concept nested loop
            }
            else{
            System.out.println("the odd"+ i); // if the number is even then print odd
            }
           // System.out.println("All number"+i);
       
        }
        
       
        System.out.println(sum);
    }
    public static void main(String args[]) // main method
    {
 eodd su= new eodd(); // object creation
    // Scanner sc =new Scanner(System.in);

    su.sen(0);// calling method using object using instance
}
}
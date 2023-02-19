interface LibraryUser{//interface 
    public void registerAccount(int age);
    public void requestbook(String booktype);
    }
    class KidUsers implements LibraryUser{
        int age ;
        String booktype;
        public void registerAccount(int age){
            if(age<=12){
                System.out.println("You have Sucessfully registered under a Kids Account");
            }
            else{
                System.out.println("Sorry,Age must be less than 12 to register as a kids");
            }
        }
            public void requestbook(String booktype){
                if(booktype=="Kids"){
             System.out.println("Book issued successfully, please return the book with in 10 days");
                }
                else{
                    System.out.println("Oops you are allowed to take only kids books");
                }
            }
        
        
    
}
    class AdultsUser implements LibraryUser{
    int age ;
    String booktype ;
    public void registerAccount(int age){
        if(age>12){
            System.out.println("you have successfully registered under an adult Account");
        }
        else{
            System.out.println("Sorry Age must be greater than 12 to register as an register");
        }
    }
    public void requestbook(String booktype){
        if(booktype=="Fiction"){
            System.out.println("Book issued successfully, please return the book with in 7 days");
               }
               else{
                   System.out.println("Oops you are allowed to take only Fiction books");
               }
           }
       }
    
    class LibraryinterfaceDemo{
        public static void main(String args[]){
        KidUsers ki =new KidUsers();
        ki.registerAccount(13);
        ki.requestbook("fffk");
        AdultsUser ad = new AdultsUser();
        ad.registerAccount(45);
        ad.requestbook("Fiction");
        }
    }
    
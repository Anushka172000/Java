interface LibraryUser{//interface 
public void registerAccount();
public void requestbook();
}
class KidUsers implements LibraryUser{
    int age ;
    String booktype;
    public void registerAccount(){
        if(age<=12){
            System.out.println("You have Sucessfully registered under a Kids Account ");
        }
        else{
            System.out.Println("Sorry,Age must be less than 12 to register as a kids");
        }
        public void requestbook{
            if(booktype=="Kids"){
         System.out.println("Book issued successfully, please return the book with in 10 days");
            }
            else{
                System.out.println("Oops you are allowed to take only kids books");
            }
        }
    }
    
}
class AdultsUser implements LibraryUser{
int age ;
String booktype ;
public void registerAccount{
    if(age=>12){
        System.out.println("you have successfully registered under an adult Account");
    }
    else{
        System.out.println("Sorry Age must be greater than 12 to register as an register");
    }
}
public void requestbook{
    if(booktype=="Fiction"){
        System.out.println("Book issued successfully, please return the book with in 7 days");
           }
           else{
               System.out.println("Oops you are allowed to take only Fiction books");
           }
       }
   }

class LibraryinterfaceDemo{
    
}

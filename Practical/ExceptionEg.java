import java.util.Scanner; // import 
class ExceptionEg{ // class Creation
    public static void main(String args[]){  // main point 
        int c; 
        Scanner sc = new Scanner(System.in); // import Scanner 
        try{ // try nested are used 
         try{
            System.out.println("Enter the your of x:"); // get input form user 
            int x  = sc.nextInt();
            System.out.println("Enter the your of y:");// get input form user 
            int y =  sc.nextInt();
            c = x/y; // calculate result division c 
            System.out.println(c); // print finally
         } 
            catch(Exception e){ // is use for when come runtime catch show the error and move forward
                System.out.println(e); // actually exception
              }
            }

         catch(Exception s){ 
            System.out.println(s);
         }

    }
         

          }

        
                      
        
    
        
    

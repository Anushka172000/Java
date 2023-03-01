import java. util.Scanner;
class Helllo{
    public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the First word"); 
String a =sc.next();
System.out.println("Enter the second word");
String b= sc.next();
int sum =a.length()+b.length();
System.out.println(sum);
 if(a.compareTo(b)>0){
 System.out.println("yes");
 }
 else{
    System.out.println("No");
 }

String capitalizeda=a.substring(0, 1).toUpperCase()+a.substring(1);
String capitalizedb=b.substring(0, 1).toUpperCase()+b.substring(1);
   System.out.println(capitalizeda+" "+capitalizedb); 
}

    }



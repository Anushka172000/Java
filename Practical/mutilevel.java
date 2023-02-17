class Flower{
string color ="Pink";
int year = 4;
 class Rose extends Flower{
    string color="Red";
    int year =3;
 }
public void Flower(){
System.out.println("the  flower is "+color);
System.out.println("the year is "+ year);
System.out.println(" the colour "+super.color);
}
public static void  main(String args[]){
Flower FL = new Flower();
FL.Flower();
}
}
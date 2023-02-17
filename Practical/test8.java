class parent {
String name ="Ram";
float Height =6.9f;
String Skin ="Browm";
int age =56;
parent(String name , float Height ,String Skin,int age)
{
    this.name =name;
    this.Height = Height;
    this.Skin=Skin;
    this.age=age;
    
System.out.println("name"+name+""+Height+""+Skin+""+age);
}
    public void display(){
        System.out.println("your are parents");
    }


}

 class son extends parent{
String name ="sam";
float Height =6.9f;
String Skin ="Wheat";
int age =26;
 son(String name , float Height ,String Skin,int age){
    super(name, Height, Skin, age);
    this.name =name;
    this.Height = Height;
    this.Skin=Skin;
    this.age=age;
System.out.println("name"+name+""+Height+""+Skin+""+age);
}
public void display(){
    System.out.println("you are Son");
}
 }
class test8{
public static void main(String args[]){
    parent pe = new parent("Ramesh", 6.9f, "Brown", 56);
    pe.display();
    son se = new son("Sam", 6.9f, "brown", 22);
    se.display();
    

}
}

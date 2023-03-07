
import java.util.Scanner;
public class OrderingManagementSystem
	{

		public static String[]
		 welcomeDrink() {//Method for welcome Drinks
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in); //Scanner Object 
			String choices; //to select the choice choice variable is define
			int inputs = 0;//define and initilize the input value to 0
			System.out.println("How many Drinks you want? from 1 to 5");
			inputs = sc.nextInt();//to get the user input 
			String MyDrink[] = new String[inputs]; //array creation
			System.out.println("Enter Your choices to select Drinks: ");//givu
			System.out.println("1) Crushes \n2) Mojito \n3) Smoothies \n4) Cold Coffe \n5) Mango Drink");

			for (int i = 0; i < MyDrink.length; i++) {//for loop to travel from the first to last element

				choices = sc.next();

				switch (choices) {//here choices to select from multiple items
				case "1":
					MyDrink[i] = "Crushes";
					break;
				case "2":
					MyDrink[i] = "Mojito";
					break;
				case "3":
					MyDrink[i] = "Smoothie";
					break;
					
				case "4":
					MyDrink[i] = "Cold Coffee";
					break;
				case "5":
					MyDrink[i] = "Mango Drink";
					break;

				default:
					break;
				}

			}
			System.out.println("Selected Drinks:");
			for (int i = 0; i < MyDrink.length; i++) {
				System.out.println((i + 1) + "  " + MyDrink[i]);
			}
			return MyDrink;
		}
		public static String[] starters() {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String choices;
			int inputs = 0;
			System.out.println("How many Appetizers from 1 to 5");
			inputs = sc.nextInt();
			String MyStarters[] = new String[inputs];
			System.out.println("Enter Your choices to select Appetizers: ");

			System.out.println("1.Salad \n 2.Corn Pakora \n3.Vegitable Samosa \n4.Sandwitch");

			for (int i = 0; i < MyStarters.length; i++) {

				choices = sc.next();

				switch (choices) {
				case "1"://here choices to select from multiple items
					MyStarters[i] = "Salad";
					break;
				case "2":
					MyStarters[i] = "Corn Pakora";
					break;
				case "3":
					MyStarters[i] = "Vegitable Samosa";
					break;
				case "4":
					MyStarters[i] = "Sandwitch";
					break;	

				default:
					break;
				}
			
			}
			System.out.println("Selected Appetizers:");
			for (int i = 0; i < MyStarters.length; i++) {
				System.out.println((i + 1) + ". " + MyStarters[i]);
			}
			return MyStarters;
		}
		public static String[] mainmeal() {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String choices;
			int inputs = 0;
			System.out.println("How many Meals you want ");
			inputs = sc.nextInt();
			String MainMeal[] = new String[inputs];
			System.out.println("Enter Your choice to select Meals: ");
			System.out.println("1) Biryani \n2)Chicken Korma \n3)Chicken 65 \n4) Pulav \n5) Dal and Rice");

			for (int i = 0; i < MainMeal.length; i++) {

				choices = sc.next();

				switch (choices) {
				case "1":
					MainMeal[i] = "Biryani";
					break;
				case "2":
					MainMeal[i] = "Chicken Korma";
					break;
				case "3":
					MainMeal[i] = "Chicken 65";
					break;
				case "4":
					MainMeal[i] = "Pulav";
					break;
				case "5":
					MainMeal[i] = "Dal and Rice";
					break;

				default:
					break;
				}

			}
			System.out.println("Selected Meals:");
			for (int i = 0; i < MainMeal.length; i++) {
				System.out.println((i + 1) + ". " + MainMeal[i]);
			}
			return MainMeal;
		}
	    public static void main(String[] args)
	    {
			System.out.println("Welcome to Our Restuarent");
			System.out.println();
			String starters[]=starters();
			System.out.println("#########################################################");
			String welcomeDrink[]=welcomeDrink();
			System.out.println("##########################################################");
			String mainMeal[]=mainmeal();
			System.out.println("############################################################");
			
			System.out.println("Your Final Order Is: ");
			for(String i:starters)
			{
				System.out.print(i+", ");
			}
			for(String i:welcomeDrink)
			{
				System.out.print(i+", ");
			}
			for(String i:mainMeal)
			{
				System.out.print(i+", ");
			}
	    }
	}
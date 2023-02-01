import java.util.Scanner;

class IfElseSwitchExample{
	
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        
        
		

		if (age >=40 && age <=65){
        System.out.println("Enter shift: ");
        String shift = sc.next();            
			
			switch(shift){
				
				case "First" :
				System.out.println("first shift allowed 6am - 3pm");
				break;
				
				case "Second" :
				System.out.println("Second shift allowed 4pm - 10 pm");
				break;
			}
			
		}
		else if(age >=20 && age <40){
            System.out.println("Enter shift: ");
        String shift1 = sc.next();
		    
			switch(shift1){
				
				case "Night" :
				System.out.println("Night shift allowed 11pm - 5 am");
				shift
				break;
				
				case "General" :
				System.out.println("General shift allowed 10am - 6 pm");
				break;
				
			}
			
		}
		else{
			System.out.println("Age is not proper");
		}
		
	}
}
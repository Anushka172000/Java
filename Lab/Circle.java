package Shape;
public class Circle {//defining the class 
	private static float radius; //as per the question private float variable with name raduis
	protected float pi;//package level access variable pi
	public Circle(){//default constructor
		super();
		this.radius=1.5f;//initializing the value of radius by 1.5f
	}
	protected Circle(float raduis){//package level access to parameterized constructor
		this(radius,3.5f);//pi value by 3.5f
	}
	
	private Circle(float raduis,float pi){//class level access to  parameterized circle constructor
		super();
		this.pi=pi;// Initializes the radius with the value passed in.
		this.radius=raduis;// Initializes the radius with the value passed in.
	}
	double calculateCircleArea (float raduis) {//method  calculate the area of  a circle
		
		 double result=(pi*raduis*raduis);//formula to calculate the area and 
		return result; //will return value as area of circle
		
	}
	double calculateCircumference(float raduis) {//method calculate circumference of  a circle
		
	
		 double result=(2 * pi * raduis);//formula to calculate of Circumference 
		return result;//result will  return here
		
	}
	public static void main(String args[]) {
		Circle c=new Circle(8);//calling constructor and creation object
		double area =c.calculateCircleArea(5);//to calculate the area call the area method
		System.out.println("The Area of Circle is :" +area);//will display the area 
		double circumference=c.calculateCircumference(6);//for circumference 
		System.out.println("The Circumference of Circle is :" +circumference);//to display the circumference
	}

}
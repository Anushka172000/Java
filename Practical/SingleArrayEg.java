
public class SingleArrayEg { // class creation

	public static void main(String[] args) {
		int myarray[]=new int[4]; // declaration &instantiation
        myarray[0]=78;// initialization
        myarray[1]=69;
        myarray[2]=90;
        myarray[3]=67;
        // traversing  an array
        for(int i=0;i<myarray.length;i++) { //length of array
        System.out.println(myarray[i]);		
	}
float num[] ={2.3F,5.6F,6.7F};// declaration
//for(float j=0;j<num.length;j++) { //length of array
   // System.out.println(float[j]);	
System.out.println("Array elements");


for(float j:num) { // for each loop
	System.out.print(j+" ");
}
	}

}

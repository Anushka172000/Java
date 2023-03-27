import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

class FirstTesting {
	@Test
void t1() {
	System.out.println("Hello Testing Program");
	Operation p1 = new Operation();
	int Result =p1.sum(1, 5);
	//assertEquals(4,Result); // false 
	assertEquals(6,Result);// true

	
}
	@Test
	void t2() {
		Operation p2 = new Operation();
		int result =p2.mul(5, 2);
	assertEquals(10,result);
	}
	@Test
	void t3() {
		Operation greater = new Operation();
	int Greater =greater.greaterBetwwenThree(3, 219, 50);
	assertEquals(219, Greater);
		
	}
	@Test 
	void t4() {
		Operation Smaller = new Operation();
	int Smaller1 =Smaller.SmallerBetwwenThree(2, 0, 20);
			assertEquals(0,Smaller1);
		
	}
	@Test void t6() {
		String str="mom";
		Operation op= new Operation();
		String result=op.reverseString(str);
		assertEquals(str, result,"values not same");
		
	}
	@Test
	void t7() {
		String str="man";
		Operation op= new Operation();
		String result=op.reverseString(str);
		assertEquals(str, result,"values not same");
		
	}
	
}
	
	



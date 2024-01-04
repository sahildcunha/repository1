package p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class gitTest {

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	 @Test
		void testadd() {
		 git objGetSum = new git();
		 int expected =5;
		 int actual = objGetSum.GetSum(3,2);
		 assertEquals (expected,actual);
	 }
	 
	 @Test
		void testremainder() {
		 git objGetRemainder = new git();
		 int expected =1;
		 int actual = objGetRemainder.GetRemainder(2,2);
		 assertEquals (expected,actual);
	}
	 @Test
		void testProduct() {
		 git objGetProduct = new git();
		 int expected =4;
		 int actual = objGetProduct.GetProduct(2,2);
		 assertEquals (expected,actual);
	}

	
}

//Q.1) WAP to create unit Test To check arithmetic operations using JUniit.
//Testing part using Junit
package com.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ArithmaticOperationTest {
	ArithmaticOperations obj1 = new ArithmaticOperations();//creating object 
	
	//Testing the addition operation
	@Test
	void addtest() {
		int addAns = obj1.add(10, 5);
		assertEquals(15, addAns);
	}
	//Testing the subtraction operation
	@Test
	void subtest() {
		int subAns = obj1.sub(10, 5);
		assertEquals(5, subAns);
	}
	//Testing the multiply operation
	@Test
	void multest() {
		int mulAns = obj1.mul(10, 5);
		assertEquals(5, mulAns);  // Here failure occurs
	}
	//Testing the division operation
	@Test
	void divtest() {
		int divAns = obj1.div(10, 5);
		assertEquals(2, divAns);
	}



}

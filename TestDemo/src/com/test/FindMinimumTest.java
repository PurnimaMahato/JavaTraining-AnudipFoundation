//Q.2)WAP to create test case to find minimum among two numbers.
//Testing part using Junit
package com.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FindMinimumTest {
	//Create test case to find minimum among two numbers.
	@Test
	void test() {
		FindMinimum obj = new FindMinimum();
		int min = obj.minimum(12, 7);
		assertEquals(7, min);
	}

}

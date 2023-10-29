package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTesting {

	@Test
	void test() {
		UnitTesting obj = new  UnitTesting() ;
		int ans = obj.add(6, 4);
		assertEquals(10, ans);
	}

}

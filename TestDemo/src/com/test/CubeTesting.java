package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CubeTesting {

	@Test
	void test() {
		UnitTesting obj = new  UnitTesting() ;
		int ans = obj.cube(3);
		assertEquals(27, ans);
		//fail("Not yet implemented");
	}

}

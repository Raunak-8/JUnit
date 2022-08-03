package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	private MyMath math = new MyMath();
	
	@Test
	void test() {
		int[] numbers= {1,2,3};// array daale jiska check karna hai
		MyMath math = new MyMath();//instance banaye main class ka
		int result = math.calculateSum(numbers);// method call kar ske n store in result
		System.out.println(result);
		int expectedResult=6;
		assertEquals(expectedResult, result);
		
	}
	
	@Test
	void test1() {
		// array daale jiska check karna hai
		// method call kar ske n store in result
		assertEquals(0, math.calculateSum(new int[] {}));
		
	}

}

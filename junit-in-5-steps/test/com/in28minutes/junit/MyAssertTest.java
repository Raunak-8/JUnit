package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {

	List<String> todo = Arrays.asList("AWS","Azure","Cloud");
	
	@Test
	void test() {
		
		
		boolean test=todo.contains("AWS");//Result from method
		boolean test2=todo.contains("Agh");//Result from method
		assertEquals(true,test);
		assertTrue(test);
		assertFalse(test2);
		assertArrayEquals(new int[] {1,2},new int[] {1,2});
		assertEquals(3,todo.size());
	}

}

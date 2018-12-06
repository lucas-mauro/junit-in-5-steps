package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {
	MyMath myMath = new MyMath();
	
	@BeforeEach
	public void before() {
		System.out.println("before");
	}
	
	@AfterEach
	public void after() {
		System.out.println("after");
	}
	@Test
	void sum_with3munbers() {
		System.out.println("test1");
		assertEquals(6, myMath.sum(new int[] { 1, 2, 3 }));
		
	}
	@Test
	void sum_with1munbers() {
		System.out.println("test2");
		assertEquals(3, myMath.sum(new int[] { 3 }));
	}
	
}

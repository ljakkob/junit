package test.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SampleTest {
	@ Test
	public void simpleTest() {
		
		int a = 1;
		int b = 2;
		assertTrue(a+b == 3);
		
	}
	@ Test
	public void simpleTest2() {
		
		int a = 3;
		int b = 2;
		assertTrue(a+b == 5);
		
	}
	
	@ Test
	public void simpleTest3() {
		
		int a = 1;
		int b = 9;
		assertTrue(a+b == 10);
		
	}

}

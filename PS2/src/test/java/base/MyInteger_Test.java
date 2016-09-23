package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	int odd = 9;
	int prime = 5;
	int even = 4;
	MyInteger one = new MyInteger(odd);
	MyInteger two = new MyInteger(prime);
	MyInteger three = new MyInteger(even);
	
			
	@Test
	public void test() { // First Cases
		assertEquals(even, three.getiValue());
		assertEquals(false, one.isEven());
		assertEquals(true, one.isOdd());
		assertEquals(false, MyInteger.isEven(odd));
		assertEquals(true, MyInteger.isOdd(odd));
		assertEquals(true, MyInteger.isPrime(prime));
		assertEquals(false, MyInteger.isEven(one));
		assertEquals(true, MyInteger.isOdd(one));
		assertEquals(true, MyInteger.isPrime(two));
		assertEquals(true, one.equals(odd));
		assertEquals(false, one.equals(two));

	}
	
	@Test
	public void testB() { // Second Cases
		assertEquals(odd, one.getiValue());
		assertEquals(true, three.isEven());
		assertEquals(false, three.isOdd());
		assertEquals(true, MyInteger.isEven(even));
		assertEquals(false, MyInteger.isOdd(even));
		assertEquals(false, MyInteger.isPrime(even));
		assertEquals(true, MyInteger.isEven(three));
		assertEquals(false, MyInteger.isOdd(three));
		assertEquals(false, MyInteger.isPrime(three));
		assertEquals(false, three.equals(odd));
		assertEquals(true, two.equals(prime));
	}

}

package org.junittest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitClassTest {
	static JunitClass class1;

	@BeforeClass
	public static void BeforeClass() {
		class1 = new JunitClass();

	}

	@Before
	public void setup() {
		class1.memoryClear();
	}

	@Test
	public void testAdd() {
		int a = 1234;
		int b = 5678;

		System.out.println("testadd");

		int execpted = 6912;
		int actual = class1.add(a, b);

		assertEquals(execpted, actual);
	}

	@Test
	public void testSub() {
		int a = 500;
		int b = 400;

		System.out.println("testsub");

		int execpted = class1.sub(a, b);
		assertTrue(execpted == 100);

	}

	@Test
	public void testMul() {
		int a = 2;
		int b = 10;

		System.out.println("testmul");

		int execpted = class1.mul(a, b);
		assertTrue(execpted == 20);

	}

	@After
	public void testreset() {
		class1.reset();
	}

	@AfterClass
	public static void AfterClas() {
		class1 = null;
	}

}

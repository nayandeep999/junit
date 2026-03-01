package com.amazon.kodewala.junit_sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AddNumbersTest {

	public static AddNumbers an;

	@BeforeAll
	public static void createObj() {
		an = new AddNumbers();
	}

	@AfterEach
	public void printAfterEachTestCase() {
		System.out.println("This is running after each test case");
	}

	@Test
	public void addingSingleNum() {
		Integer expected = 10;
		Integer actual = an.addNumbers(10);

		assertEquals(expected, actual);
	}

	@Test
	public void addingMultipleNum() {
		Integer expected = 10;
		Integer actual = an.addNumbers(5, 5);

		assertEquals(expected, actual);
	}

	@Test
	@Disabled
	public void addingAllZeroes() {
		Integer expected = 0;
		Integer actual = an.addNumbers(0, 0, 0);

		assertEquals(expected, actual);
	}

}

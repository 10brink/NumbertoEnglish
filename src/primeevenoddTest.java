import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class primeevenoddTest {


	@Test
	void test1() {

		String expected = "ODD";
		String actual = primeevenodd.primebuzz(1);
		assertEquals(expected, actual);
	}

	@Test
	void test3() {
		String expected = "PRIME";
		String actual = primeevenodd.primebuzz(3);
		assertEquals(expected, actual);
	}

	@Test
	void test10() {
		String expected = "EVEN";
		String actual = primeevenodd.primebuzz(10);
		assertEquals(expected, actual);
	}

	@Test
	void testprime() {

		boolean expected = false;
		boolean actual = primeevenodd.isPrime(1);
		assertEquals(expected, actual);

	}
}

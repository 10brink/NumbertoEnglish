package Numtoenglish;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NumtoenglishTest {

	@Test
	void test1() {
		String expected = "one dollars";
		String actual = Numtoenglish.NumtoE(1);
		assertEquals(expected, actual);
	}

	@Test
	void test2() {
		String expected = "two dollars";
		String actual = Numtoenglish.NumtoE(2);
		assertEquals(expected, actual);
	}

	@Test
	void test10() {
		String expected = " ten dollars";
		String actual = Numtoenglish.NumtoE(10);
		assertEquals(expected, actual);

	}

	@Test
	void test19() {
		String expected = " nineteen dollars";
		String actual = Numtoenglish.NumtoE(19);
		assertEquals(expected, actual);
	}

	@Test
	void test21() {
		String expected = " twenty-one dollars";
		String actual = Numtoenglish.NumtoE(21);
		assertEquals(expected, actual);
	}

	@Test
	void test44() {
		String expected = " forty-four dollars";
		String actual = Numtoenglish.NumtoE(44);
		assertEquals(expected, actual);
	}

	@Test
	void test99() {
		String expected = " ninety-nine dollars";
		String actual = Numtoenglish.NumtoE(99);
		assertEquals(expected, actual);
	}

	@Test
	void test120() {
		String expected = "one hundred and twenty dollars";
		String actual = Numtoenglish.NumtoE(120);
		assertEquals(expected, actual);
	}

	@Test
	void test745() {
		String expected = "seven hundred and forty-five dollars";
		String actual = Numtoenglish.NumtoE(745);
		assertEquals(expected, actual);
	}

	@Test
	void test1000() {
		String expected = "one thousand dollars";
		String actual = Numtoenglish.NumtoE(1000);
		assertEquals(expected, actual);
	}

	@Test
	void test1001() {
		String expected = "one thousand one dollars";
		String actual = Numtoenglish.NumtoE(1001);
		assertEquals(expected, actual);
	}

}

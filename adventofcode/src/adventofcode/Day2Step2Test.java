package adventofcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Day2Step2Test {

	@Test
	void test() {
		assertEquals(4, Day2Step2.getEvenlyDivisibleResult(Day2.getRowValues("5 9 2 8")));
		assertEquals(3, Day2Step2.getEvenlyDivisibleResult(Day2.getRowValues("9 4 7 3")));
		assertEquals(2, Day2Step2.getEvenlyDivisibleResult(Day2.getRowValues("3 8 6 5")));
	}

}

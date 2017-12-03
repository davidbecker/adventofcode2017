package adventofcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Day1Test {

	@Test
	void test() {
		assertEquals("3", Day1.getSolution("1122"));
		assertEquals("4", Day1.getSolution("1111"));
		assertEquals("0", Day1.getSolution("1234"));
		assertEquals("9", Day1.getSolution("91212129"));
	}

}

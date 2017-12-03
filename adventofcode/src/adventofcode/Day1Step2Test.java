package adventofcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Day1Step2Test {

	@Test
	void test() {
		assertEquals("6", Day1Step2.getSolution("1212"));
		assertEquals("0", Day1Step2.getSolution("1221"));
		assertEquals("4", Day1Step2.getSolution("123425"));
		assertEquals("12", Day1Step2.getSolution("123123"));
		assertEquals("4", Day1Step2.getSolution("12131415"));
	}

}

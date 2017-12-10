package adventofcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Day10Step2Test {

	@Test
	void testInputLength() {
		int[] lengthInput = Day10Step2.getLengthInput("1,2,3");
		int i = 0;
		assertEquals(49, lengthInput[i++]);
		assertEquals(44, lengthInput[i++]);
		assertEquals(50, lengthInput[i++]);
		assertEquals(44, lengthInput[i++]);
		assertEquals(51, lengthInput[i++]);
		assertEquals(17, lengthInput[i++]);
		assertEquals(31, lengthInput[i++]);
		assertEquals(73, lengthInput[i++]);
		assertEquals(47, lengthInput[i++]);
		assertEquals(23, lengthInput[i++]);
	}

	@Test
	void testDenseHashBlock() {
		assertEquals(64,
				Day10Step2.getDenseHashBlock(new int[] { 65, 27, 9, 1, 4, 3, 40, 50, 91, 7, 6, 0, 2, 5, 68, 22 }, 0));
	}

	@Test
	void testOutputHash() {
		assertEquals("a2582a3a0e66e6e86e3812dcb672a272", Day10Step2.getSolution(""));
		assertEquals("33efeb34ea91902bb2f59c9920caa6cd", Day10Step2.getSolution("AoC 2017"));
		assertEquals("3efbe78a8d82f29979031a4aa0b16a9d", Day10Step2.getSolution("1,2,3"));
		assertEquals("63960835bcdc130f0b66d7ff4f6a5a8e", Day10Step2.getSolution("1,2,4"));
	}

}

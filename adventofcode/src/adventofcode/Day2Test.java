package adventofcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class Day2Test {
	private static final String PUZZLE_INPUT = "5 1 9 5\r\n" + "7 5 3\r\n" + "2 4 6 8";

	@Test
	void testSplitRows() {
		List<String> splitRows = Day2.splitRows(PUZZLE_INPUT);
		assertEquals("5 1 9 5", splitRows.get(0));
		assertEquals("7 5 3", splitRows.get(1));
		assertEquals("2 4 6 8", splitRows.get(2));
	}

	@Test
	void testRowDifferences() {
		assertEquals(8, Day2.getRowDifference("5 1 9 5"));
		assertEquals(4, Day2.getRowDifference("7 5 3"));
		assertEquals(6, Day2.getRowDifference("2 4 6 8"));
	}

	@Test
	void testChecksum() {
		assertEquals(18, Day2.getChecksup(PUZZLE_INPUT));
	}

}

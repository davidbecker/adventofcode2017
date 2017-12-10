package adventofcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Day10Test {
	
	private Day10 day10;
	
	@BeforeEach
	void init() {
		day10 = new Day10();
		day10.init(5);
	}

	@Test
	void testReverse() {
		day10.reverse(3);
		assertEquals(2, day10.list[0]);
		assertEquals(1, day10.list[1]);
		assertEquals(0, day10.list[2]);
		assertEquals(3, day10.list[3]);
		assertEquals(4, day10.list[4]);
		day10.reverse(4);
		assertEquals(4, day10.list[0]);
		assertEquals(3, day10.list[1]);
		assertEquals(0, day10.list[2]);
		assertEquals(1, day10.list[3]);
		assertEquals(2, day10.list[4]);
		day10.reverse(1);
		assertEquals(4, day10.list[0]);
		assertEquals(3, day10.list[1]);
		assertEquals(0, day10.list[2]);
		assertEquals(1, day10.list[3]);
		assertEquals(2, day10.list[4]);
		day10.reverse(5);
		assertEquals(3, day10.list[0]);
		assertEquals(4, day10.list[1]);
		assertEquals(2, day10.list[2]);
		assertEquals(1, day10.list[3]);
		assertEquals(0, day10.list[4]);
	}

}

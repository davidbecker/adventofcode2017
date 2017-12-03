package adventofcode;

public class Day1Step2 implements IDaySolution {

	@Override
	public String getSolution() {
		return getSolution(Day1.INPUT);
	}

	public static String getSolution(String input) {
		if (input == null) {
			return null;
		}
		int sum = 0;
		int length = input.length();
		int current;
		int next;
		for (int i = 0; i < length; i++) {
			current = getValue(input, length, i);
			next = getOffsetValue(input, length, i);
			if (current == next) {
				sum += current;
			}
		}
		return String.valueOf(sum);
	}

	private static int getValue(String input, int length, int position) {
		if (position < length && position >= 0) {
			return input.charAt(position) - Day1.ASCII_OFFSET;
		}
		return 0;
	}

	private static int getOffsetValue(String input, int length, int position) {
		int offset = position + length / 2;
		if (offset >= length) {
			offset -= length;
		}
		return getValue(input, length, offset);
	}

}

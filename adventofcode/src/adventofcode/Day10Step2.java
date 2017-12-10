package adventofcode;

public class Day10Step2 implements IDaySolution {

	private static final int[] MAGIC_NUMBERS = { 17, 31, 73, 47, 23 };
	private static final int COUNT_MAGIC_NUMBERS = 5;

	private static final String PUZZLE_INPUT = "83,0,193,1,254,237,187,40,88,27,2,255,149,29,42,100";
	private static final int ROUNDS = 64;
	private static final int BLOCK_SIZE = 16;

	@Override
	public String getSolution() {
		return getSolution(PUZZLE_INPUT);
	}

	public static String getSolution(String input) {
		return outputHash(getDenseHash(getSparseHash(input)));
	}

	public static int[] getLengthInput(String input) {
		int size = input.length();
		size += COUNT_MAGIC_NUMBERS;
		int[] result = new int[size];
		for (int i = 0; i < size - COUNT_MAGIC_NUMBERS; i++) {
			result[i] = input.charAt(i);
		}
		result[size - COUNT_MAGIC_NUMBERS] = 17;
		for (int i = 0; i < COUNT_MAGIC_NUMBERS; i++) {
			result[size - COUNT_MAGIC_NUMBERS + i] = MAGIC_NUMBERS[i];
		}
		return result;
	}

	public static int[] getSparseHash(String input) {
		Day10 day10 = new Day10();
		day10.init(BLOCK_SIZE * BLOCK_SIZE);
		int[] lengthInput = getLengthInput(input);
		int count = input.length() + COUNT_MAGIC_NUMBERS;
		for (int i = 0; i < ROUNDS; i++) {
			for (int j = 0; j < count; j++) {
				day10.reverse(lengthInput[j]);
			}
		}
		return day10.list;
	}

	public static int[] getDenseHash(int[] sparseHash) {
		int result[] = new int[BLOCK_SIZE];
		for (int i = 0; i < BLOCK_SIZE; i++) {
			result[i] = getDenseHashBlock(sparseHash, i);
		}
		return result;
	}

	public static int getDenseHashBlock(int[] sparseHash, int blockOffset) {
		int offset = blockOffset * BLOCK_SIZE;
		int result = 0;
		for (int i = 0; i < BLOCK_SIZE; i++) {
			result ^= sparseHash[offset + i];
		}
		return result;
	}

	public static String outputHash(int[] hash) {
		StringBuilder sb = new StringBuilder();
		String toAppend;
		for (int i = 0; i < hash.length; i++) {
			toAppend = Integer.toHexString(hash[i]);
			if (toAppend.length() == 1) {
				sb.append("0");
			}
			sb.append(toAppend);
		}
		return sb.toString();
	}

}

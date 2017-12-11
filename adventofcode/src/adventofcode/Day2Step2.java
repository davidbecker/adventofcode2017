package adventofcode;

import java.util.List;

public class Day2Step2 implements IDaySolution {

	@Override
	public String getSolution() {
		int result = 0;
		List<String> splitRows = Day2.splitRows(Day2.PUZZLE_INPUT);
		for (String row : splitRows) {
			result += getEvenlyDivisibleResult(Day2.getRowValues(row));
		}
		return String.valueOf(result);
	}

	public static int getEvenlyDivisibleResult(List<Integer> input) {
		int a, b;
		int size = input.size();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i != j) {
					a = input.get(i);
					b = input.get(j);
					if (a % b == 0) {
						return a / b;
					}
				}
			}
		}
		return 0;
	}

}

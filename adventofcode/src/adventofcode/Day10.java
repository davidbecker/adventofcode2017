package adventofcode;

public class Day10 implements IDaySolution {

	public int[] list;
	private int listSize;
	private int currentPosition;
	private int skipSize;

	public void init(int listSize) {
		list = new int[listSize];
		for (int i = 0; i < listSize; i++) {
			list[i] = i;
		}
		currentPosition = 0;
		skipSize = 0;
		this.listSize = listSize;
	}

	public void reverse(int length) {
		int indexA, indexB;
		int tmp;
		for (int i = 0; i < length / 2; i++) {
			indexA = getWrappedPosition(currentPosition + i);
			indexB = getWrappedPosition(currentPosition + length - i - 1);
			tmp = list[indexA];
			list[indexA] = list[indexB];
			list[indexB] = tmp;
		}
		currentPosition = getWrappedPosition(currentPosition + length + skipSize);
		skipSize += 1;
	}

	private int getWrappedPosition(int pos) {
		if (pos >= listSize) {
			return getWrappedPosition(pos - listSize);
		}
		return pos;
	}

	@Override
	public String getSolution() {
		init(256);
		reverse(83);
		reverse(0);
		reverse(193);
		reverse(1);
		reverse(254);
		reverse(237);
		reverse(187);
		reverse(40);
		reverse(88);
		reverse(27);
		reverse(2);
		reverse(255);
		reverse(149);
		reverse(29);
		reverse(42);
		reverse(100);
		return String.valueOf(list[0] * list[1]);
	}

}

package giuf;

public class niuke013 {
	public int movingCount(int threshold, int rows, int cols) {
		boolean bool[][] = new boolean[rows][cols];
		return hashPath(threshold, rows, cols, 0, 0, bool);
	}

	public int hashPath(int threshold, int rows, int cols, int row, int col, boolean bool[][]) {
		if (row < 0 || col < 0 || row >= rows || col >= cols || bool[row][col] == true
				|| number(row) + number(col) > threshold)
			return 0;
		bool[row][col] = true;
		return 1 + hashPath(threshold, rows, cols, row - 1, col, bool)
				+ hashPath(threshold, rows, cols, row, col - 1, bool)
				+ hashPath(threshold, rows, cols, row + 1, col, bool)
				+ hashPath(threshold, rows, cols, row, col + 1, bool);
	}

	public int number(int x) {
		int sum = 0;
		do {
			sum += x % 10;
			x = x / 10;
		} while (x> 0);
		return sum;

	}

}

package LinkCode2039;

public class LC038 {
	// write your code here
	// 从右上角开始搜索，因为从左到右递增，从上到下递增，从右上角
	// 开始搜索的话效率高，target值大于矩阵点row++,target值小于
	// 矩阵点，column--，target值等于矩阵点，count++,row++,column--
	public int searchMatrix(int[][] matrix, int target) {
		int count = 0;
		if (matrix.length == 0)
			return 0;
		int row = matrix.length;
		int col = matrix[0].length;
		int i = 0;
		int j = col - 1;
		while (i <= row - 1 && j >= 0) {
			if (target > matrix[i][j])
				i++;
			else if (target < matrix[i][j])
				j--;
			else {
				count++;
				i++;
				j--;
			}
		}
		return count;
	}
}

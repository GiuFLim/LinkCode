package giuf;

import java.util.Arrays;

/**
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
 * 请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是重复的数字2或者3。
 */

/*
 * 思路： 将数组进行快排;遍历数组,看相邻的两个数是否相等
 */

public class Duplicate {
	public boolean duplicate(int numbers[], int length, int[] duplication) {
		if (length == 0)
			return false;
		duplication[0] = -1;
		Arrays.sort(numbers);
		boolean flag = false;
		for (int i = 0; i < length - 1; i++) {
			if (numbers[i] == numbers[i + 1]) {
				duplication[0] = numbers[i];

				flag = true;
				return flag;
			}

		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duplicate dup = new Duplicate();
		int[] array = { 2, 3, 1, 0, 2, 5, 3 };
		int[] arr = new int[1];
		System.out.println(dup.duplicate(array, array.length, arr));

	}

}

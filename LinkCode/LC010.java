package LinkCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * 15. 全排列
给定一个数字列表，返回其所有可能的排列。

样例
给出一个列表[1,2,3]，其全排列为：

[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 */
/*
 * 思路：回溯法

1 对数组排序，
2定义回溯函数   
3   定义递归结束条件，即起始位置大于等于数组大小。 
4 每次交换俩个数，递归后在交换回来，保证下次递归。 
 */
public class LC010 {
	public List<List<Integer>> permute(int[] nums) {
		List<Integer> list = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		track(nums, list, result);
		return result;
	}

	/*
	 * 16. 带重复元素的排列 给出一个具有重复数字的列表，找出列表所有不同的排列。
	 * 
	 * 样例 给出列表 [1,2,2]，不同的排列有：
	 * 
	 * [ [1,2,2], [2,1,2], [2,2,1] ]
	 */
	public List<List<Integer>> permuteUnique(int[] nums) {
		// write your code here
		ArrayList<List<Integer>> result = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		Arrays.sort(nums);
		int n = nums.length;
		int[] visited = new int[n];
		for (int i = 0; i < n; i++) {
			visited[i] = 0;
		}
		trackUnique(nums, visited, list, result);
		return result;
	}

	public void trackUnique(int[] a, int[] visited, List<Integer> list, List<List<Integer>> result) {
		if (a.length == list.size()) // 递归结束条件
			result.add(new ArrayList<>(list));

		for (int i = 0; i < a.length; i++) {
			// 已经被访问过的和没有被访问过但是前面有一个相同的数没有被访问过，都不能加进去
			if (visited[i] == 1 || (i != 0 && (visited[i - 1] == 0 && a[i] == a[i - 1])))
				continue;
			list.add(a[i]);
			visited[i] = 1;
			trackUnique(a, visited, list, result);
			list.remove(list.size() - 1);
			visited[i] = 0;

		}
	}


	public void track(int[] a, List<Integer> list, List<List<Integer>> result) {
		if (a.length == list.size())
			result.add(new ArrayList<>(list));
		else {
			for (int i = 0; i < a.length; i++) {
				if (list.contains(a[i]))
					continue;
				list.add(a[i]);
				track(a, list, result);
				list.remove(list.size() - 1);

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC010 lc = new LC010();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		List<List<Integer>> result = lc.permute(a);
		System.out.println(result);
		int[] arr = new int[]{1,2,2};
		List<List<Integer>> result1 = lc.permuteUnique(arr);
		System.out.println(result1);
	}

}

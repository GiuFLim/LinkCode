package LinkCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
 * 17. 子集
给定一个含不同整数的集合，返回其所有的子集

样例
如果 S = [1,2,3]，有如下的解：

[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
挑战
你可以同时用递归与非递归的方式解决么？

注意事项
子集中的元素排列必须是非降序的，解集必须不包含重复的子集


} 
 */
public class LC011 {

	public List<List<Integer>> subsets(int[] nums) {
		// write your code here
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		if (nums==null)
			return result;
		Arrays.sort(nums);
		def(nums, 0, list, result);
		result.add(new ArrayList<Integer>());
		return result;
	}

	public void def(int[] arr, int start, List<Integer> list, List<List<Integer>> result) {
		for (int i = start; i < arr.length; i++) {
			if (list.contains(arr[i]))
				continue;
			// list是以整数为元素的动态数组，而result是以数组为元素的数组，
			// 在这一步，当list增加完元素后，list所有元素构成一个完整的子串，再由result纳入
			list.add(arr[i]);
			result.add(new ArrayList<Integer>(list));
			def(arr, i + 1, list, result);
			list.remove(list.size() - 1);

		}
	}
	
	public List<List<Integer>> subsets2(int[] nums) {
		// write your code here
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		if (nums==null)
			return result;
		Arrays.sort(nums);
		def2(nums, 0, list, result);
		result.add(new ArrayList<Integer>());
		return result;
	}
	
	public void def2(int[] arr, int start, List<Integer> list, List<List<Integer>> result) {
		// list是以整数为元素的动态数组，而result是以数组为元素的数组，
		// 在这一步，当list增加完元素后，list所有元素构成一个完整的子串，再由result纳入
		result.add(new ArrayList<Integer>(list));
		for (int i = start; i < arr.length; i++) {

            //if (i != 0 && arr[i] == arr[i - 1] && i>start )
			//if (i != start && arr[i]==arr[i-1]) 
			if(i>start&&arr[i-1]==arr[i]) continue; 
	
			
			list.add(arr[i]);
			
			def(arr, i + 1, list, result);
			list.remove(list.size() - 1);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 1,2,3 };
		LC011 s = new LC011();
		List<List<Integer>> res = s.subsets(a);
		for (int i = 0; i < res.size(); i++)
			System.out.println(res.get(i));
		System.out.println("---------------");
		int[] a2 = new int[] { 1,2,2 };
		LC011 s2 = new LC011();
		List<List<Integer>> res2 = s2.subsets(a2);
		for (int i = 0; i < res2.size(); i++)
			System.out.println(res2.get(i));

	}

}

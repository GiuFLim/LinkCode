package LinkCode;

import java.util.ArrayList;

public class LC006 {
	private ArrayList<Integer> result = new ArrayList<Integer>();

	public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
		// write your code here
		// 首先我的思路是：分别找到k1 k2第一个小于和第一个大于的点然后按着
		// 其每一个节点的后序后续节点add到数组result里面
		// ArrayList<Integer> result = new ArrayList<Integer>();
		if (root == null) {
			return result;
		}
		inOrderTree(root, k1, k2);
		return result;
	}

	private void inOrderTree(TreeNode root, int k1, int k2) {
		if (root == null) {
			return;
		}
		if (root.val > k1) {
			// 这里需要区分和一般的判断某一个数是否在给定的区间里面
			// 在这里如果root值大于k1说明k1在root的左边，
			// 需要继续往左找一直找到第一个root.val小于k1的那个点

			inOrderTree(root.left, k1, k2);
		}
		if (root.val >= k1 && root.val <= k2) {
			result.add(root.val);
		}
		if (root.val < k2) {
			inOrderTree(root.right, k1, k2);
		}
	}
}

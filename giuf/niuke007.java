package giuf;

/*
 * 1：题目描述：
从上往下打印出二叉树的每个节点，同层节点从左至右打印。
	2：代码和思路
思路：这里我们可以借助队列来实现
1：每次打印一个节点的时候，如果该节点有子节点，则把该节点的子节点放到一个队列的末尾；
2：接下来到队列的头部取出最早进入队列的节点，重复前面的打印工作，直至队列中所有的节点都被打印出来
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class niuke007 {
	ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (pRoot == null)
			return result;
		LinkedList<TreeNode> link = new LinkedList<TreeNode>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		link.add(pRoot);
		int start = 0, end = 1;
		while (!link.isEmpty()) {
			TreeNode node = link.remove();
			list.add(node.val);
			start++;
			if (node.left != null) {
				link.add(node.left);
			}
			if (node.right != null) {
				link.add(node.right);
			}
			if (start == end) {
				end = link.size();
				start = 0;
				result.add(list);
				list = new ArrayList<Integer>();
			}
		}

		return result;

	}

}

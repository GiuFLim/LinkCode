package giuf;

/**
 * 解题思路: 如果有右子树，则找右子树的最左节点; 没右子树，则找第一个当前节点是父节点左孩子的节点;
 * 
 */
public class niuke004 {
	public TreeLinkNode GetNext(TreeLinkNode pNode) {
		if (pNode == null)
			return pNode;
		if (pNode.right != null) {
			pNode = pNode.right;
			while (pNode.left != null)
				pNode = pNode.left;

			return pNode;
		}
		while (pNode != null) {
			if (pNode == pNode.next.left)
				return pNode.next;
			pNode = pNode.next;

		}
		return null;
	}

}

package giuf;

public class niuke008 {
	public int index = -1; // 节点在序列中的索引

	/**
	 * 序列化 前序遍历，将二叉树节点的值转为字符序列，null转为“#”
	 */
	String Serialize(TreeNode root) {
		StringBuffer s = new StringBuffer();
		if (root == null) {
			s.append("#,");
			return s.toString();
		}
		s.append(root.val+",");
		s.append(Serialize(root.left));
		s.append(Serialize(root.right));
		return s.toString();

	}

	/**
	 * 反序列化
	 */
	TreeNode Deserialize(String str) {
		index++;
		int length = str.length();
		if (index >= length)
			return null;
		String[] s = str.split(",");
		TreeNode pNode = null;
		if (!s[index].equals("#")) {
			pNode = new TreeNode(Integer.valueOf(s[index]));
			pNode.left = Deserialize(str);
			pNode.right = Deserialize(str);

		}

		return pNode;
	}

}

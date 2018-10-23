package LinkCode;

public class LC001 {
	int index = -1;

	public String serialize(TreeNode root) {
		// write your code here
		StringBuffer s = new StringBuffer();
		if (root == null) {
			s.append("#,");
			return s.toString();
		}
		s.append(root.val + ",");
		s.append(serialize(root.left));
		s.append(serialize(root.right));
		return s.toString();

	}

	public TreeNode deserialize(String data) {
		index++;
		int length = data.length();
		if (index >= length)
			return null;
		String[] s = data.split(",");
		TreeNode node = null;
		if (!s[index].equals("#")) {
			node = new TreeNode(Integer.valueOf(s[index]));
			node.left = deserialize(data);
			node.right = deserialize(data);
		}
		return node;
	}

}

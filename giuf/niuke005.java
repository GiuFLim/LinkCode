package giuf;

public class niuke005 {
	boolean isSymmetrical(TreeNode pRoot){
		if(pRoot==null)return true;
		return Symmetrical(pRoot.left,pRoot.right);
	}
	//递归判断两个左右子树是否对称
	boolean Symmetrical(TreeNode node1,TreeNode node2){
		//如果均为空，说明相等，是对称的
		if(node1==null&&node2==null)return true;
		//如果有一个为空，另一个不为空，说明不对称
		if(node1==null||node2==null)return false;
		//都不为空时，判断值是否相等，再递归判断左右子树
		if(node1.val!=node2.val)return false;
		return Symmetrical(node1.left,node2.right)&&Symmetrical(node1.right,node2.left);
		
	}

}

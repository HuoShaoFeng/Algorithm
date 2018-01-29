package Problem27;


public class MirrorOfTree {

	public static void main(String[] args) {
		TreeNode troot1 = new TreeNode(8);
		TreeNode n1 = new TreeNode(8);
		TreeNode n2 = new TreeNode(7);
		TreeNode n3 = new TreeNode(9);
		TreeNode n4 = new TreeNode(3);
		TreeNode n5 = new TreeNode(4);
		TreeNode n6 = new TreeNode(7);
		troot1.left = n1;troot1.right=n2;
		n1.left=n3;n1.right=n4;
		n2.left=null;n2.right=null;
		n3.left=null;n3.right=null;
		n4.left=n5;n4.right=n6;
		n5.left=null;n5.right=null;
		n6.left=null;n6.right=null;

		MirrorTree(troot1);
		
	}
	
	//将二叉树 更改为 其 镜像树
	public static void MirrorTree(TreeNode root) {
		if(root==null)
			return;
		if(root.left==null && root.right==null) 
			return;
		
		//交换左右两个子节点
		TreeNode tmp = root.left;
		root.left = root.right;
		root.right = tmp;
		
		if(root.left!=null)
			MirrorTree(root.left);
		if(root.right!=null)
			MirrorTree(root.right);
		
	}

}

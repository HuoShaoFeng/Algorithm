package Problem55;

public class DepthOfBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		root.left=n2;root.right=n3;
		n2.left =n4 ;n2.right = n5;
		n3.left = null;n3.right = n6;
		n4.left = null;n4.right = null;
		n5.left = n7;n5.right = null;
		n6.left = null;n6.right = null;
		n7.left = null;n7.right = null;

		System.out.println("以"+root.data+"为根的二叉树的深度为："+getDepth(root));
		System.out.println("以"+n2.data+"为根的二叉树的深度为："+getDepth(n2));
		System.out.println("以"+n3.data+"为根的二叉树的深度为："+getDepth(n3));
		System.out.println("以"+n4.data+"为根的二叉树的深度为："+getDepth(n4));
		System.out.println("以"+n5.data+"为根的二叉树的深度为："+getDepth(n5));
		System.out.println("以"+n6.data+"为根的二叉树的深度为："+getDepth(n6));
		System.out.println("以"+n7.data+"为根的二叉树的深度为："+getDepth(n7));
		System.out.println("以null为根的二叉树的深度为："+getDepth(null));

	}

	private static int getDepth(TreeNode root) {
		if(root==null)
			return 0;
		
		int  left = getDepth(root.left); 	//左子树的深度
		int  right = getDepth(root.right);	//右子树的深度
		
		return left>right?left+1:right+1;
	}
}

package Problem28;



public class SymmetricTree {

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
		
		System.out.println(isSymmetricTree(troot1,troot1));
	}

	private static boolean isSymmetricTree(TreeNode root1,TreeNode root2) {
		if(root1 == null && root2==null)
			return true;
		if(root1 == null || root2==null)
			return false;
		
		if(root1.data!=root2.data)
			return false;
		
		return isSymmetricTree(root1.left, root2.right) && isSymmetricTree(root1.right, root2.left);
	}

}

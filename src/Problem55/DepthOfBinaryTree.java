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

		System.out.println("��"+root.data+"Ϊ���Ķ����������Ϊ��"+getDepth(root));
		System.out.println("��"+n2.data+"Ϊ���Ķ����������Ϊ��"+getDepth(n2));
		System.out.println("��"+n3.data+"Ϊ���Ķ����������Ϊ��"+getDepth(n3));
		System.out.println("��"+n4.data+"Ϊ���Ķ����������Ϊ��"+getDepth(n4));
		System.out.println("��"+n5.data+"Ϊ���Ķ����������Ϊ��"+getDepth(n5));
		System.out.println("��"+n6.data+"Ϊ���Ķ����������Ϊ��"+getDepth(n6));
		System.out.println("��"+n7.data+"Ϊ���Ķ����������Ϊ��"+getDepth(n7));
		System.out.println("��nullΪ���Ķ����������Ϊ��"+getDepth(null));

	}

	private static int getDepth(TreeNode root) {
		if(root==null)
			return 0;
		
		int  left = getDepth(root.left); 	//�����������
		int  right = getDepth(root.right);	//�����������
		
		return left>right?left+1:right+1;
	}
}

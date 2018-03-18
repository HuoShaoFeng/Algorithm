package Problem27;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import Problem_32.Node;

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

		/*
		 *           8
		 *       8       7
		 *     9   3  
		 *        4 7 
		 * 
		 */
		
		
		
		
		printTreeByLevel(troot1);
		System.out.println();
		
//		MirrorTree(troot1);
		MirrorTreeUnrecur(troot1);
		printTreeByLevel(troot1);
	}
	
	//非递归方式
	public static void MirrorTreeUnrecur(TreeNode root) {
		if(root==null)
			return;
		else {
			Stack<TreeNode> stack = new Stack<>();
			stack.push(root);
			while(!stack.isEmpty()) {
				root = stack.pop();
				
		        TreeNode temp;
		        temp=root.right;
		        root.right=root.left;
		        root.left=temp;
				
		        if(root.left!=null)
		        	stack.push(root.left);
				if(root.right!=null)
					stack.push(root.right);
			}	
		}		
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

	
	private static void printTreeByLevel(TreeNode root) {
		if(root==null)
			return;
		Queue<TreeNode> queue = new LinkedList<>();
		int level = 1;
		TreeNode last = root;
		TreeNode nLast = null;
		queue.offer(root);
		
		System.out.print("Level "+(level++)+" : ");
		
		while(!queue.isEmpty()) {
			root = queue.poll();
			System.out.print(root.data+"  ");
			if(root.left!=null) {
				queue.offer(root.left);
				nLast = root.left;
			}
			if(root.right!=null) {
				queue.offer(root.right);
				nLast = root.right;
			}
			
			if(root==last && !queue.isEmpty()) {
				System.out.println();
				System.out.print("Level "+(level++)+" : ");
				last = nLast;
			}
		}
	}
}

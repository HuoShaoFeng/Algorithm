package Problem36;

import java.util.LinkedList;
import java.util.Queue;

public class TreeToList {

	public static void main(String[] args) {
		TreeNode troot1 = new TreeNode(10);
		TreeNode n1 = new TreeNode(6);
		TreeNode n2 = new TreeNode(14);
		TreeNode n3 = new TreeNode(4);
		TreeNode n4 = new TreeNode(8);
		TreeNode n5 = new TreeNode(12);
		TreeNode n6 = new TreeNode(16);
		
		troot1.left = n1;troot1.right=n2;
		n1.left=n3;n1.right=n4;
		n2.left=n5;n2.right=n6;
		n3.left=null;n3.right=null;
		n4.left=null;n4.right=null;
		n5.left=null;n5.right=null;
		n6.left=null;n6.right=null;

		TreeNode ret = convert(troot1);
		while(ret!=null) {
			System.out.print(ret.data+", ");
			ret = ret.right;
		}
		
	}
	
	public static TreeNode convert(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<>();
		inorderToQueue(root, queue);
		if(queue.isEmpty())
			return root;
		
		root = queue.poll();
		TreeNode pre = root;
		pre.left = null;
		TreeNode cur = null;
		while(!queue.isEmpty()) {
			cur = queue.poll();
			pre.right = cur;
			cur.left = pre;
			pre =cur;
		}
		pre.right=null;
		return root;
	}
	
	
	//中序遍历（从小到大排序）入队列
	public static void inorderToQueue(TreeNode root,Queue<TreeNode> queue) {
		if(root!=null) {
			inorderToQueue(root.left,queue);
			queue.offer(root);
			inorderToQueue(root.right, queue);
		}
	}
	
	
	
	
	
	
	

}

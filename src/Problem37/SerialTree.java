package Problem37;

import java.util.LinkedList;
import java.util.Queue;



public class SerialTree {
	
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
		
		System.out.println(serialByPre(root));
	}
	
	//前序序列化 二叉树
	public static String serialByPre(TreeNode head) {
		if(head==null)
			return "#!";
		
		String res = head.data+"!";
		res += serialByPre(head.left);
		res += serialByPre(head.right);
		return res;
	}
	
	//前序 反序列化二叉树
	public static TreeNode reconByPreString(String preStr) {
		String[] values = preStr.split("!");
		Queue<String> queue = new LinkedList<>();
		for(String s : values) {
			queue.offer(s);
		}
		return reconPreOrder(queue);
	}

	private static TreeNode reconPreOrder(Queue<String> queue) {
		String value = queue.poll();
		if(value=="#")
			return null;
		
		TreeNode head = new TreeNode(Integer.valueOf(value));
		head.left = reconPreOrder(queue);
		head.right = reconPreOrder(queue);
		return head;
	}

}

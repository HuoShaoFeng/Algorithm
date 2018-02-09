package Problem54;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.SynchronousQueue;

public class KthNodeOfBinarySearchTree {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);
		root.left=node3;root.right=node7;
		node3.left=node2;node3.right=node4;
		node7.left=node6;node7.right=node8;
		node2.left=null;node2.right=null;
		node4.left=null;node4.right=null;
		node6.left=null;node6.right=null;
		node8.left=null;node8.right=null;
		
//		System.out.println("Kth = "+getKthNode(root));
		System.out.println("Kth2 = "+getKthNode2(root,3).data);
		
		getKthNodeInOrder(root);
		TreeNode nod = list.get(2);
		System.out.println("KthInOrder = "+nod.data);
	
	}

//	static int k=3;
//	private static int getKthNode(TreeNode root) {
//		TreeNode tmp=null;
//		if(root!=null) {
//			getKthNode(root.left);
//			if(k-- == 1 && tmp!=null)
//				return tmp.data;
//			
//			getKthNode(root.right);
//		}
//		return -1;
//	}
	
	
	
	
	public static List<TreeNode> list = new ArrayList<>();
	private static void getKthNodeInOrder(TreeNode root) {
		if(root!=null) {
			getKthNodeInOrder(root.left);
			list.add(root);
			getKthNodeInOrder(root.right);
		}
	}
	
	static int index=0;
	public static TreeNode getKthNode2(TreeNode root,int k) {
		
        if(root != null){ //中序遍历寻找第k个
            TreeNode node = getKthNode2(root.left,k);
            if(node != null)
                return node;
            index ++;
            if(index == k)
                return root;
            node = getKthNode2(root.right,k);
            if(node != null)
                return node;
        }
        return null;
	}
	

}

package Problem26;

import java.util.LinkedList;
import java.util.Queue;

public class WhetherHasSubtree {
	
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
		
		TreeNode troot2 = new TreeNode(8);
		TreeNode n11 = new TreeNode(9);
		TreeNode n12 = new TreeNode(3);
		troot2.left = n11;troot2.right=n12;
		n11.left=null;n11.right=null;
		n12.left=null;n12.right=null;
		
//		PrintTreeByLayer(troot1);
		PrintTreeByLayer(troot2);
		
		System.out.println(hasSubtree(troot1,troot2));
		
	}

	private static boolean hasSubtree(TreeNode troot1, TreeNode troot2) {

		boolean has = false;
		
		if(troot1!=null && troot2!=null) {
			
			if(troot1.data==troot2.data) 
				has = hasSubtree2(troot1, troot2);
			
			if(has==false)
				has = hasSubtree(troot1.left, troot2);
			if(has==false)
				has = hasSubtree(troot1.right, troot2);
		}
		
		return has;
	}

	private static boolean hasSubtree2(TreeNode r1, TreeNode r2) {
		if(r2==null)
			return true;
		
		if(r1==null)
			return false;
		
		if(r1.data != r2.data)
			return false;
		
		return hasSubtree2(r1.left, r2.left) && hasSubtree2(r1.right,r2.right);
		
	}

	//²ãÐò±éÀú´òÓ¡¶þ²æÊ÷
	public static void PrintTreeByLayer(TreeNode root) {
		if(root==null)
			return;
		
		Queue<TreeNode> list = new LinkedList<>();
		list.offer(root);
		
		while(list.size()>0) {

			root = list.poll();

			System.out.print(root.data+"  ");
			
			if(root.left!=null) {
				list.offer(root.left);
			}
			if(root.right!=null)
				list.offer(root.right);
		}
		System.out.println();
	}
	
}

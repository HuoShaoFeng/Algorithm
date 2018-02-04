package Problem_32;

import java.util.LinkedList;
import java.util.Queue;


public class LayerTranverseLine {

	public static void main(String[] args) {

		Node root1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		
		root1.left = n2;root1.right=n3;
		n2.left=n4;n2.right=null;
		n3.left=n5;n3.right=n6;
		n4.left=null;n4.right=null;
		n5.left=n7;n5.right=n8;
		n6.left=null;n6.right=null;
		n7.left=null;n7.right=null;
		n8.left=null;n8.right=null;
		
		printTreeByLevel(root1);
		
	}

	private static void printTreeByLevel(Node root) {
		if(root==null)
			return;
		Queue<Node> queue = new LinkedList<>();
		int level = 1;
		Node last = root;
		Node nLast = null;
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

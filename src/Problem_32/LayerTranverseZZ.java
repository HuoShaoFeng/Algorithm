package Problem_32;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LayerTranverseZZ {

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
		
		printTreeByZZ(root1);
	}

	private static void printTreeByZZ(Node root) {
		if(root==null)
			return;
		Deque<Node> dq = new LinkedList<>();
		boolean left2Right = true;//从左向右遍历
		Node last = root;
		Node nLast=null;
		dq.offerFirst(root);
		
		while (!dq.isEmpty()) {
			if(left2Right) {//左到右
				root = dq.pollFirst();//头部弹出
				if(root.left!=null) { //左子节点 从 尾部 入队列
					nLast = (nLast == null ? root.left : nLast);
					dq.offerLast(root.left);
				}
				if(root.right!=null) { //右子节点 从 尾部 入队列
					nLast = (nLast == null ? root.right : nLast);
					dq.offerLast(root.right);
				}
			}
			else {//右到左
				root = dq.pollLast();//尾部弹出
				if(root.right!=null) { //右子节点 从 头部 入队列
					nLast = (nLast == null ? root.right : nLast);
					dq.offerFirst(root.right);
				}
				if(root.left!=null) { //左子节点 从 头部 入队列
					nLast = (nLast == null ? root.left : nLast);
					dq.offerFirst(root.left);
				}
			}
			System.out.print(root.data+", ");
			if(root==last && !dq.isEmpty()) {
				left2Right = !left2Right;
				last = nLast;
				nLast=null;
				System.out.println();
			}
		}
	}
}

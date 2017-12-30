package Problem32;

import java.util.LinkedList;
import java.util.Queue;

import javax.xml.soap.Node;

public class LayerTranverse {

	public static void main(String[] args) {

	}
	/*
	LinkedList 是一个继承于AbstractSequentialList的双向链表。它也可以被当作堆栈、队列或双端队列进行操作。
	LinkedList 实现 List 接口，能对它进行队列操作。
	LinkedList 实现 Deque 接口，即能将LinkedList当作双端队列使用。
	*/
	public static void layerTranverseTree(Node root){
		if(root==null)
			return;
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()){
			Node tmp = q.poll();
			System.out.print(tmp.data+" ");
			
			if(tmp.left!=null)
				q.add(tmp.left);
			
			
			if(tmp.right!=null)
				q.add(tmp.right);
		}
	}
}

package Problem_32;

import java.util.LinkedList;
import java.util.Queue;


public class LayerTranverse {

	public static void main(String[] args) {

		Node troot1 = new Node(8);
		Node n1 = new Node(8);
		Node n2 = new Node(7);
		Node n3 = new Node(9);
		Node n4 = new Node(3);
		Node n5 = new Node(4);
		Node n6 = new Node(7);
		troot1.left = n1;troot1.right=n2;
		n1.left=n3;n1.right=n4;
		n2.left=null;n2.right=null;
		n3.left=null;n3.right=null;
		n4.left=n5;n4.right=n6;
		n5.left=null;n5.right=null;
		n6.left=null;n6.right=null;
		
		layerTranverseTree(troot1);
		
	}
	/*
	LinkedList ��һ���̳���AbstractSequentialList��˫��������Ҳ���Ա�������ջ�����л�˫�˶��н��в�����
	LinkedList ʵ�� List �ӿڣ��ܶ������ж��в�����
	LinkedList ʵ�� Deque �ӿڣ����ܽ�LinkedList����˫�˶���ʹ�á�
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

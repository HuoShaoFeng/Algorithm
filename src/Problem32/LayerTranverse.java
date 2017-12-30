package Problem32;

import java.util.LinkedList;
import java.util.Queue;

import javax.xml.soap.Node;

public class LayerTranverse {

	public static void main(String[] args) {

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

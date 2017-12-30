package Problem18;

import java.util.concurrent.SynchronousQueue;

import javax.print.event.PrintJobAttributeListener;

class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		next = null;
	}
}

public class DeleteNode {
	public static void main(String[] args) {
		Node nh = new Node(5);
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		nh.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = null;
		System.out.println("删除前：");
		PrintList(nh);
		System.out.println("删除"+nh.data+"后：");
		DeleteNodeList(nh, nh);
		PrintList(nh);
	}
	
	public static  void DeleteNodeList(Node head,Node deleteNode) {
		if(head==null || deleteNode==null)
			return;
		
		//删除的不是尾节点
		if(deleteNode.next!=null) {
			Node nxt = deleteNode.next;
			deleteNode.data = nxt.data;
			deleteNode.next = nxt.next;
		}else if(head==deleteNode) {//链表只有一个节点，是头节点也是尾节点
			deleteNode = null;
			head = null;
		}else {//链表中有多个节点，删除尾节点
			Node tmp = head;
			while(tmp.next!=deleteNode) {
				tmp=tmp.next;
			}
			//tmp.next==deleteNode
			tmp.next = null;
		}
	}
	
	public static void PrintList(Node head) {
		Node tmp = head;
		if(tmp==null)
			return;
		while(tmp!=null) {
			System.out.print(tmp.data+"  ");
			tmp = tmp.next;
		}
		System.out.println();
	}

}

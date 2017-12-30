package Problem18;

public class DeleteRepeatNode {

	public static void main(String[] args) {
		Node nh = new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(3);
		Node n5 = new Node(3);
		Node n6 = new Node(5);
		Node n7 = new Node(7);
		nh.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = null;
		System.out.println("删除前：");
		PrintList(nh);
		System.out.println("删除"+nh.data+"后：");
		DeleteNodeList(nh);
		PrintList(nh);
	}

	//删除链表中重复的节点
	public static void DeleteNodeList(Node nh) {
		
		
		
	}

	public static void PrintList(Node nh) {
		Node tmp = nh;
		while(tmp!=null) {
			System.out.println(tmp.data+"  ");
			tmp = tmp.next;
		}
	}

}

package Problem24;



public class ReverseList {

	public static void main(String[] args) {
		Node head = new Node(2);
		Node n1 = new Node(5);
		Node n2 = new Node(6);
		Node n3 = new Node(0);
		Node n4 = new Node(3);
		Node n5 = new Node(9);
		Node n6 = new Node(7);
		
		head.next = n1;n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;n5.next=n6;n6.next=null;

		Node nn = head;
		while (nn!=null) {
			System.out.print(nn.data+"  ");
			nn = nn.next;
		}
		System.out.println();
		
		nn = Reverse_List(head);
		while (nn!=null) {
			System.out.print(nn.data+"  ");
			nn = nn.next;
		}

	}
	
	public static Node Reverse_List(Node head) {

		Node pre = null;
		Node nxt = null;
		
		while(head!=null) {
			nxt = head.next;
			head.next = pre;
			pre = head;
			head = nxt;
		}
		return pre;
	}
	
	

}

package Problem25;



public class MergeSortList {

	public static void main(String[] args) {
		Node head1 = new Node(2);
		Node n1 = new Node(5);
		Node n2 = new Node(6);
		Node n3 = new Node(9);
		head1.next = n1;n1.next=n2;n2.next=n3;n3.next=null;
		
		Node head2 = new Node(1);
		Node n4 = new Node(4);
		Node n5 = new Node(8);
		Node n6 = new Node(11);
		Node n7 = new Node(13);
		Node n8 = new Node(16);
		head2.next = n4;n4.next=n5;n5.next=n6;n6.next=n7;n7.next=n8;n8.next=null;
		
		Node ret = MergeList1(head1, head2);
		while (ret!=null) {
			System.out.print(ret.data+"  ");
			ret = ret.next;
		}
	}
	
	public static Node MergeList(Node head1,Node head2) {
		Node head = null;
		
		Node n1 = head1;
		Node n2 = head2;
		
		if(n1==null)
			return head=n2;
		else if(n2==null)
			return head=n1;
			
		if(n1.data<n2.data) {
			head = n1;
			head.next = MergeList(n1.next, n2);
		}else {
			head = n2;
			head.next = MergeList(n1, n2.next);
		}
		
		return head;
	}
	
	public static Node MergeList1(Node head1,Node head2) {
		Node head = null;
		
		Node n1 = head1;
		Node n2 = head2;
		
		if(n1==null)
			return head=n2;
		else if(n2==null)
			return head=n1;
		
		if(n1.data<n2.data) {
			head = n1;
			n1 = n1.next;
		}else {
			head = n2;
			n2 = n2.next;
		}
		Node tmp = head;
		
		
		while(n1!=null && n2!=null) {
			if(n1.data<n2.data) {
				tmp.next = n1;
				n1 = n1.next;
			}else {
				tmp.next = n2;
				n2 = n2.next;
			}
			tmp = tmp.next;
		}
		
		while(n1!=null) {
			tmp.next = n1;
			n1 = n1.next;
			tmp = tmp.next;
		}
		while(n2!=null) {
			tmp.next = n2;
			n2 = n2.next;
			tmp = tmp.next;
		}
		
		return head;
	}

}

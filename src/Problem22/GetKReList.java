package Problem22;


public class GetKReList {

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
		
		Node n = getKReNode(head,2);
		if(null==n) 
			System.out.println("null");
		else
			System.out.println(n.data);
		
	}
	
	public static Node getKReNode(Node head,int k) {
		if(head==null || k<=0 )
			return null;
		
		Node node = head;
		Node tmp = head;
		
		int i =0;
		for(i=0;i<k-1 && tmp.next!=null ;++i) {
			tmp = tmp.next;
		}
		
		//tmp都到了最后一个节点，而i还没有移动k-1步，说明k大于链表的长度
		if(i<k-1) 
			return null;

		
		while(tmp.next!=null) {
			tmp = tmp.next;
			node = node.next;
		}
		return node;
	}

}

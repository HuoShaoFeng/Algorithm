package Problem23;

public class EntryNode {
	
	public static void main(String[] args) {
		Node head = new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(7);
		Node n3 = new Node(4);
		Node n4 = new Node(5);
		Node n5 = new Node(6);
		Node n6 = new Node(9);
		head.next = n1;n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;n5.next=n6;n6.next=n3;
		
		Node enNode = getEntryNode(head);
		System.out.println(enNode.data);

	}

	private static Node getEntryNode(Node head) {
		//�ҵ���ָ�����ָ���������
		Node meetNode = meetingNode(head);
		if(meetNode==null)
			return null;
		
		//�ҵ����е�ĸ���
		Node tmp = meetNode.next;
		int size = 1;
		while(tmp.data!=meetNode.data) {
			size++;
			tmp = tmp.next;
		}
		
		Node front = head;
		Node behind = head;
		for(int i=0;i<size;++i) {
			front = front.next;
		}
		while(front.data!=behind.data) {
			front = front.next;
			behind = behind.next;
		}
		
		return behind;
	}
	
	private static Node meetingNode(Node head) {
		if(head==null)
			return null;
		Node slow = head.next;
		if(slow==null)
			return null;
		Node fast = slow.next;
		while(fast!=null && fast.next!=null && slow!=null) {
			if(fast==slow)
				return slow;
			
			slow = slow.next;
			
			fast = fast.next.next;
				
		}
		return null;
	}
	
	

}

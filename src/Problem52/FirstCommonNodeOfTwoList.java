package Problem52;

public class FirstCommonNodeOfTwoList {
	
	public static void main(String[] args) {
		Node h1 = new Node(10);
		Node node1 = new Node(11);
		
		Node h2 = new Node(20);
		Node node21 = new Node(21);
		Node node22 = new Node(22);
		Node node23 = new Node(23);
		
		Node nodeC1 = new Node(6);
		Node nodeC2 = new Node(7);
		Node nodeC3 = new Node(8);
		
		h1.next = node1;
		node1.next = nodeC1;
		nodeC1.next=nodeC2;nodeC2.next=nodeC3;nodeC3.next=null;
		
		h2.next=node21;
		node21.next=node22;
		node22.next=node23;
		node23.next=h1;
		
		System.out.println(getFirstCommonNode(h1,h2).data);
	}

	private static Node getFirstCommonNode(Node h1, Node h2) {
		int len1 = getLen(h1);
		int len2 = getLen(h2);
		int diff = 0 ;
		Node shortList = null;
		Node longList = null;
		if(len1>len2) {
			diff = len1-len2;
			shortList = h2;
			longList = h1;
		}else {
			diff = len2-len1;
			shortList = h1;
			longList = h2;
		}
		
		while(diff>0) {
			longList = longList.next;
			diff--;
		}
		
		while(shortList.data!=longList.data) {
			shortList = shortList.next;
			longList = longList.next;
		}
		return shortList;
		
	}

	private static int getLen(Node head) {
		Node tmp = head;
		int len = 0;
		while(tmp!=null) {
			tmp=tmp.next;
			len++;
		}
		return len;
	}
	

}

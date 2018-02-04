package Problem35;

public class ComplexListClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//step1
	public static void cloneNodes(ComplexListNode head) {
		ComplexListNode node = head;
		while(node != null) {
			ComplexListNode cloned = new ComplexListNode();
			cloned.data = node.data;
			cloned.next = node.next;
			cloned.sibling = null;
			node.next = cloned;
			node = cloned.next;
		}
	}
	
	//step 2
	public static void connectSiblingNodes(ComplexListNode head) {
		ComplexListNode node = head;
		while(node != null) {
			ComplexListNode cloned = node.next;
			if(node.sibling!=null)
				cloned.sibling = node.sibling.next;
			node = node.next;
		}
	}
	
	//step3
	public static ComplexListNode ReconnNodes(ComplexListNode head) {
		ComplexListNode node =head;
		ComplexListNode cHead = null;
		ComplexListNode cNode = null;
		if(node!=null) {
			cHead = cNode = node.next;
			node.next = cNode.next;
			node = node.next;
		}
		while(node!=null) {
			cNode.next = node.next;
			cNode = cNode.next;
			node.next = cNode.next;
			node = node.next;
		}
		return cHead;
	}

}

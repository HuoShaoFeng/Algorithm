package Problem18;

import java.util.HashMap;
import java.util.Map;

public class DeleteRepeatNode {

	public static void main(String[] args) {
		Node nh = new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(2);
		Node n3 = new Node(5);
		Node n4 = new Node(5);
		Node n5 = new Node(5);
		Node n6 = new Node(7);
		Node n7 = new Node(9);
		nh.next = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = null;
		System.out.println("ɾ��ǰ��");
		PrintList(nh);
		System.out.println("ɾ����");
		Node  nnn = DeleteNodeList(nh);
//		DeleteNodeLeft1(nh);
		PrintList(nnn);
	}
	
	//ɾ���ظ��Ľڵ㣨��һ����
	public static void DeleteNodeLeft1(Node head) {
		Map<Integer,Integer> map = new HashMap<>();
		Node cur = head;
		Node nxt = cur.next;
		if(cur==null)
			return;
		
		if(!map.containsKey(cur.data)) {//û�д���
			map.put(cur.data, 1);
		}
		
		while(nxt!=null) {
			
			if(!map.containsKey(nxt.data)) {//û�д���
				map.put(nxt.data, 1);
				
				cur.next = nxt;
				cur = cur.next;
				
			}else {//�Ѿ������ˣ�˵���ظ���
			}
			nxt = nxt.next;
		}
		cur.next = null;
	}

	//ɾ���������ظ��Ľڵ�
	public static Node DeleteNodeList(Node head) {
		if(null == head)
			return null;
		
		Node node = head;
		Node pre = null;
		
		while(node!=null) {
			boolean isDel = false;
			
			Node nxt = null;
			if(node.next!=null)
				nxt = node.next;
			
			if(nxt!=null && node.data==nxt.data) {
				isDel=true;
			}
			
			if(isDel==false) {
				pre = node;
				node = node.next;
			}
			else {//��Ҫɾ��
				int value = node.data;
				Node toDel = node;
				while(toDel!=null && toDel.data==value) {
					nxt = toDel.next;
					toDel = null;
					toDel = nxt;
				}
				if(pre==null) {
					head = nxt;
				}
				else {
					pre.next = nxt;
				}
				node = nxt;
			}
		}
		return head;
	}

	public static void PrintList(Node nh) {
		Node tmp = nh;
		if(tmp==null)
			System.out.println("null");
		while(tmp!=null) {
			System.out.print(tmp.data+"  ");
			tmp = tmp.next;
		}
		System.out.println();
	}

}

package Problem09;

import java.util.Stack;

public class MyQueue {

	private Stack<Integer> stackIn;
	private Stack<Integer> stackOut;
	
	public MyQueue() {
		this.stackIn = new Stack<>();
		this.stackOut = new Stack<>();
	}

	//�ڶ���β��׷��Ԫ��
	public void appendTail(int data) {
		stackIn.push(data);
	}

	public int deleteHead() throws Exception {
		if(stackOut.size()<=0) {
			while(!stackIn.isEmpty()) {
				stackOut.push(stackIn.pop());
			}
		}
		if(stackOut.size()<=0) {//�������û��Ԫ��
			throw new Exception("����Ϊ�գ�");
		}
		int head = stackOut.pop();
		return head;
	}
	
	
	public static void main(String[] args) throws Exception {
		MyQueue queue = new MyQueue();
		queue.appendTail(5);
		queue.appendTail(1);
		queue.appendTail(3);
		queue.appendTail(6);
		queue.appendTail(11);
		queue.appendTail(3);
		
		
		System.out.println(queue.deleteHead());
		System.out.println(queue.deleteHead());
		System.out.println(queue.deleteHead());
		System.out.println(queue.deleteHead());
		System.out.println(queue.deleteHead());
		
	}
	
}

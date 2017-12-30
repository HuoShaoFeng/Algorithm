package Problem09;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

	private Deque<Integer> queue1;
	private Deque<Integer> queue2;
	
	public MyStack() {
		super();
		queue1 = new LinkedList<>();
		queue2 = new LinkedList<>();
	}

	public void pushStack(int data) {
		queue1.addLast(data);
	}

	public int popStack() throws Exception {
		if(queue1.size()<=0) {
			if(queue2.size()<=0)
				throw new Exception("╤сапн╙©у");
			else {
				queue1.addLast(queue2.removeLast());
			}
		}else {//queue1.size()>0
			while(queue1.size()>1) {
				queue2.addLast(queue1.removeFirst());
			}
		}
		return queue1.removeFirst();
	}






	public static void main(String[] args) throws Exception {
		MyStack stack = new MyStack();
		
		stack.pushStack(3);
		stack.pushStack(5);
		stack.pushStack(6);
		stack.pushStack(2);
		
		System.out.println(stack.popStack());
		System.out.println(stack.popStack());
		System.out.println(stack.popStack());
	}

}

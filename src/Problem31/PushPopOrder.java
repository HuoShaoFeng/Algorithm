package Problem31;

import java.util.Stack;

/**
 * 输入两个序列，第一个序列表示栈的压入顺序，判断第二个序列是否为改栈的弹出序列
 * @author huosf
 *
 */
public class PushPopOrder {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {4,1,3,5,2};
		System.out.println(isPopOrder(arr1, arr2));
	}

	public static boolean isPopOrder(int[] push,int[] pop) {
		boolean b = false;
		if(push==null || pop==null)
			return false;
		if(push.length!=pop.length)
			return false;
		Stack<Integer> stackData = new Stack<>();
		int ipush = 0;
		int ipop=0;
		while(ipop<pop.length) {
			while(stackData.isEmpty() || stackData.peek()!=pop[ipop]) {
				if(ipush==push.length)
					break;
				stackData.push(push[ipush++]);
			}
			if(stackData.peek()!=pop[ipop]) {
				break;
			}
			stackData.pop();
			ipop++;
		}
		if(stackData.isEmpty()&&ipop==pop.length)
			b = true;
		return b;
	}
	
}

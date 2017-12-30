package Problem06;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class End2StartList {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();
		list.add(6);
		list.add(7);
		list.add(9);
		list.add(5);
		list.add(2);
		list.add(7);
		list.add(3);
		
//		invertPrintList_Stack(list);
		
		invertPrintList_Recursive(list);
		
		
		
	}
	
	public static void invertPrintList_Stack(List<Integer> list){
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < list.size(); i++) {
			stack.push(list.get(i));
		}
		
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}

	
	
	public static void invertPrintList_Recursive(List<Integer> list){
		int index = 0;
		if(!list.isEmpty()){
			int value = list.remove(index++);
			invertPrintList_Recursive(list);
			System.out.println(value);
		}
	}
}

package Problem59;

import java.util.LinkedList;
import java.util.Queue;

public class MaxOfQueue {

	public static void main(String[] args) {

		int[] arr = {2,3,4,2,6,2,5,1};
		int[] ret = getMaxWindow(arr, 3);
		for (int i : ret) {
			System.out.print(i+"  ");
		}
		System.out.println();
	}
	
	public static int[] getMaxWindow(int[] arr,int w) {
		if(arr==null || w<=0 || arr.length<w)
			return null;
		
		LinkedList<Integer> qmax = new LinkedList<>();
		int[] ret = new int[arr.length-w+1];
		int index = 0;
		for(int i=0;i<arr.length;++i) {
			while(!qmax.isEmpty() && arr[qmax.peekLast()]<=arr[i]) {
				qmax.pollLast();
			}
			qmax.addLast(i);
			if(qmax.peekFirst()==i-w)
				qmax.pollFirst();
			if(i>=w-1)
				ret[index++]=arr[qmax.peekFirst()];
			
		}
		
		return ret;
	}
	

}

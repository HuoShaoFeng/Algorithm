package Problem60;

import java.util.concurrent.SynchronousQueue;

/**
 * n个骰子的点数
 * @author huosf
 *
 */
public class Shaizi {
	public static int maxValue = 6 ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printProbability(3);
	}
	
	public static void printProbability(int number) {
		if(number<1)
			return;
		
		int maxSum = maxValue * number;
		
		//和的范围：n--6n，0--5n，需要6n-n+1个数
		int[] proArr = new int[maxSum - number +1] ;
		
		getProbability(number,proArr);
		
		int total = (int) Math.pow(6, number);
		
		for (int i = 0; i < proArr.length; i++) {
			double ratio = (proArr[i]*1.0)/total;
			System.out.println("和为 "+(i+number)+" 出现的概率为："+ratio);
		}
	}

	public static void getProbability(int number, int[] proArr) {
		for (int i = 1; i <= maxValue; i++) {
			getProbability(number,number,i,proArr);	
		}
	}
	
	public static void getProbability(int number,int cur,int sum,int[] proArr) {
		if(cur==1)
			proArr[sum-number]++;
		else {
			for (int i = 1; i <= maxValue; i++) {
				getProbability(number, cur-1,i+sum,proArr);
			}
		}
	}
	

}

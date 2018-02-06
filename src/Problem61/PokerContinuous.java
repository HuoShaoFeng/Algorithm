package Problem61;

import java.util.Arrays;

/**
 * 扑克牌中的顺子
 * @author huosf
 *
 */
public class PokerContinuous {

	public static void main(String[] args) {
		int[] arr = {3,0,7,0,4};
		
		System.out.println(isContinuous(arr));

	}

	public static boolean isContinuous(int[] arr) {
		if(arr==null || arr.length<1)
			return false;
		Arrays.sort(arr);

		int numZero = 0;
		int numGap = 0;
		//统计数组中0的个数
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0)
				numZero++;
		}
		//统计数组中间隔数
		int small = numZero;//small从排序数组中第一个不为0的下标开始
		int big = small +1;
		while(big<arr.length) {
			if(arr[small]==arr[big])//对子出现，肯定不是顺子
				return false;
			numGap += arr[big]-arr[small]-1;
			small = big;
			big++;
		}
		if(numZero>=numGap)
			return true;
		
		return false;
	}

}

package Problem03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 在一个长度为n的数组里的所有数字都在 0~ n-1 的范围内，数组里某些数字是重复的，
 * 但不知道几个数字重复了，也不知道每个数字重复了几次，找出数组中任意一个重复的数字。
 * 例如长度为7的数组{2，3，1，0，2，5，3}，结果应该是2或3.
 */
public class RepeatNumInArray {

	public static void main(String[] args) {
		int[] srcArray = new int[]{9,3,1,6,0,4,5};
//		int tmp = findRepeatNumByHash(srcArray);
//		int tmp = findRepeatNumByOrder(srcArray);
		int tmp = findRepeatNum(srcArray);
		System.out.println(tmp);

	}
	
	public static int findRepeatNum(int[] arr){
		int ret = -1;
		if(arr.length<=0)//数组长度不合法
			return -1;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0 || arr[i]>arr.length-1)//数值越界
				return -1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			while(arr[i]!=i){
				if(arr[i]==arr[arr[i]]){	//下标为i和下标为arr[i]的值一样，说明是重复的数字
					ret = arr[i];
					return ret;
				}
				
				//arr[i] ！= arr[arr[i]]
				int tmp = arr[i];
				arr[i]=arr[tmp];
				arr[tmp]=tmp;
			}
		}
		return ret;
	}
	
	
	
	public static int findRepeatNumByOrder(int[] arr){
		int ret = -1;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]){
				ret = arr[i];
				break;
			}
		}
		return ret;
	}
	
	
	
	public static int findRepeatNumByHash(int[] arr){
		int ret=-1;
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if(!map.containsKey(arr[i]))	//如果未出现过
				map.put(arr[i], 100);
			else{	//出现过了
				ret = arr[i];
				break;
			}
		}
		return ret;
	}
}

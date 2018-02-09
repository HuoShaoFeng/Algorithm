package Problem56;

/**
 * 数组中有一个数字只出现了一次，其他都出现了3次，找出这个数字
 * @author huosf
 *
 */
public class NumOccurAmongOther3Times {

	public static void main(String[] args) {
		int[] arr = {7,7,3,3,2,2,3,7,5,2};
		int otherAppearTimes = 3;
		System.out.println(findOnce(arr,otherAppearTimes));
	}

	private static int findOnce(int[] arr, int otherAppearTimes) {
		int[] bitCount = new int[32];
		
		//统计数组中，每一位为1的和
		for(int i=0;i<arr.length;++i) {
			for(int j=0;j<32;++j) {
				bitCount[j]+=(arr[i]>>j)&1;
			}
		}
		
		int appearOne = 0;
		for(int i=0;i<32;++i) {
			bitCount[i]%=3;
			if(bitCount[i]!=0)
				appearOne += (1<<i);
		}
		return appearOne;
		
		
	}

}

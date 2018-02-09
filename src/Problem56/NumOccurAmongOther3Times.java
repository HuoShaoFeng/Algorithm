package Problem56;

/**
 * ��������һ������ֻ������һ�Σ�������������3�Σ��ҳ��������
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
		
		//ͳ�������У�ÿһλΪ1�ĺ�
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

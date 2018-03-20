package Problem42;

/**
 * 连续子数组的最大和
 * @author huosf
 *
 */
public class MaxSumOfSubArray {

	
	public static void main(String[] args) {
		int[] arr= {4,-3,6,-7,-2,-5};
//		System.out.println(getMaxSum(arr));
		
		
		System.out.println(getMaxAndIndex(arr));
		System.out.println("起始位置： "+index[0]+", "+index[1]);
	}

	private static int[] index = new int[2];
	//求最大连续子数组的和的同时求出相应的起始位置
	public static int getMaxAndIndex(int[] arr) {
		int max = arr[0];
		int curSum=0;
		int start = 0;
		for(int i=0;i<arr.length;++i) {
			if(curSum<0) {
				curSum=arr[i];
				start=i;
			}else
				curSum+=arr[i];
			if(max<curSum) {
				max = curSum;
				index[0]=start;
				index[1]=i;
			}
		}
		return max;
	}
	
	
	private static int getMaxSum(int[] arr) {
		int max = Integer.MIN_VALUE;
		
		if(arr==null || arr.length<1)
			return Integer.MIN_VALUE;
		
		int sum = 0;
		for(int i=0;i<arr.length;++i) {
			sum+=arr[i];
			if(sum>max)
				max=sum;
			if(sum<0)
				sum=0;
		}
		return max;
	}

}

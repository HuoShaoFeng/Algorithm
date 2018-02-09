package Problem42;

/**
 * 连续子数组的最大和
 * @author huosf
 *
 */
public class MaxSumOfSubArray {

	
	public static void main(String[] args) {
		int[] arr= {1,-2,3,10,-4,7,2,-5};
		System.out.println(getMaxSum(arr));
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

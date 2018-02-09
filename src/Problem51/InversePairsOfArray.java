package Problem51;

/**
 * 求数组中逆序对的总数
 * @author huosf
 *
 */
public class InversePairsOfArray {

	public static void main(String[] args) {
		
		int[] arr = {7,5,6,4};
		
		System.out.println("pairs = "+getInversePairs(arr));
		
		
	}

	private static int getInversePairs(int[] arr) {
		if(arr==null || arr.length<2)
			return 0;
		
		int[] copy = new int[arr.length];
		for(int i=0;i<arr.length;++i)
			copy[i]=arr[i];
		
		int count = inversePairsCore(arr,copy,0,arr.length-1);
		return count;
	}

	private static int inversePairsCore(int[] arr, int[] copy, int start, int end) {
		if(start==end) {
			copy[start]=arr[start];
			return 0;
		}
		
		int len = (end-start)/2;
		//注意copy 和 arr的位置
		int left  = inversePairsCore(copy, arr, start, start+len);
		int right = inversePairsCore(copy, arr, start+len+1, end);
		
		//i初始化为前半段的最后一个数字的下标
		int i = start+len;
		//j为后半段最后一个数字的下标
		int j = end;
		int indexCopy = end;
		int count = 0;
		
		while(i>=start && j>=start+len+1) {
			if(arr[i]>arr[j]) {
				copy[indexCopy--]=arr[i--];
				count += (j - (start+len+1) +1);
			}
			else {
				copy[indexCopy--]=arr[j--];
			}
		}
		
		for(;i>=start;i--)
			copy[indexCopy--]=arr[i];
		
		for(;j>=start+len+1;j--)
			copy[indexCopy--]=arr[j];
		
		return left+right+count;
				
	}

}

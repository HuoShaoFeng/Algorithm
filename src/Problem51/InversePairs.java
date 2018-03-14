package Problem51;

public class InversePairs {

	static int count=0;
	
	public static void main(String[] args) {
		int[] arr = new int[] {9,7,5,6,14};
		getPairs(arr);
		System.out.println(count);

	}

	private static void getPairs(int[] arr) {
		merge_sort(arr,0,arr.length-1);
	}

	private static void merge_sort(int[] arr, int begin, int end) {
		if(begin<end) {
			int mid = (begin+end)>>1;
			merge_sort(arr, begin, mid);
			merge_sort(arr, mid+1, end);
			merge(arr,begin,mid,end);
		}
	}

	private static void merge(int[] arr, int begin, int mid, int end) {
		int leftCount = mid-begin+1;
		int rightCount = end - mid;
		int[] left = new int[leftCount];
		int[] right = new int[rightCount];
		
		int iL = begin;
		for (int i = 0; i < leftCount; i++) 
			left[i]=arr[iL++];
		int iR = mid+1;
		for (int i = 0; i < rightCount; i++) 
			right[i]=arr[iR++];
		
		//从后向前
		int lindex = leftCount-1;
		int rindex = rightCount-1;
		int i=0;
		for(i=end; lindex>=0&& rindex>=0; ) {
			if(left[lindex]>right[rindex]) {
				count += (rindex+1);
				arr[i--]=left[lindex--];
			}else {
				arr[i--]=right[rindex--];
			}
		}
		
		while(lindex>=0)
			arr[i--]=left[lindex--];
		
		while(rindex>=0)
			arr[i--]=right[rindex--];
				
	}

}

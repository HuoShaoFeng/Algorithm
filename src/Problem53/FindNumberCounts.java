package Problem53;

public class FindNumberCounts {

	public static void main(String[] args) {
		int[] arr = {1,2,3,3,3,3,3,5};
		int n=3;
		System.out.println(getCounts(arr,n));

	}

	private static int getCounts(int[] arr, int n) {
		//找到第一个3出现的位置，和最后一个位置，相减即可
		int first = getFirstIndex(arr,n);
		System.out.println(first);
		int last = getLastIndex(arr,n);
		System.out.println(last);
		return last-first+1;
	}


	//基于二分查找方法  找第一次出现的位置
	private static int getFirstIndex(int[] arr, int n) {
		int start = 0;
		int end = arr.length-1;
		int mid = (start+end)>>1;
		while(start<end) {
			if(arr[mid]>n) {
				end = mid-1;
			}
			else if(arr[mid]<n) {
				start = mid+1;
			}
			else {
				if(arr[mid-1]==n)
					end = mid-1;
				if(arr[mid-1]<n)
					return mid;
			}
			mid = (start+end)>>1;
		}
		return mid;
	}
	
	private static int getLastIndex(int[] arr, int n) {
		int start = 0;
		int end = arr.length-1;
		int mid = (start+end)>>1;
		while(start<end) {
			if(arr[mid]>n) {
				end = mid-1;
			}
			else if(arr[mid]<n) {
				start = mid+1;
			}
			else {
				if(arr[mid+1]==n)
					start = mid+1;
				if(arr[mid+1]>n)
					return mid;
			}
			mid = (start+end)>>1;
		}
		return mid;
	}
	

}

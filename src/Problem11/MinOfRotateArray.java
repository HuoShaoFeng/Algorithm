package Problem11;

public class MinOfRotateArray {
	
	
	public static void main(String[] args) {
		int[] arr= {1,1,1,-1,1};
		System.out.println(getMin(arr));		
				
	}

	public static int getMin(int[] arr) {
		
		int low = 0;
		int high = arr.length-1;
		int mid = low;
		
		while(arr[low]>=arr[high]) {
			if(high==low+1) {//找到了最小值
				mid=high;
				break;
			}
			
			mid = (low+high)>>1;
			//如果low，high和mid三个下标的数组的值都相等，只能通过顺序遍历low和high之间查找最小的值
			if(arr[low]==arr[high]&&arr[low]==arr[mid]) {
				int min=Integer.MAX_VALUE;
				for(int i=low;i<=high;++i) {
					if(min>arr[i])
						min = arr[i];
				}
				return min;
			}
			if(arr[mid]>arr[low]) {
				low = mid;
			}
			if(arr[mid]<arr[high]) {
				high = mid;
			}
		}
		return arr[mid];
	}
}

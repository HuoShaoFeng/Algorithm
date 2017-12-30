package Problem57;

public class SumIsS {

	public static void main(String[] args) {
		int []arr = new int[] {1,2,4,7,8,13,15};
		
		int s = 15;
		
//		printTwoNum1(arr, s);
//		printTwoNum2(arr, s);
		
		printTwoNum3(arr, s);
		
	}
	
	//蛮力法：两层for循环
	public static void printTwoNum1(int[] arr,int s) {
		for (int i = 0;i<arr.length; ++i) {
			for(int j=i+1;j<arr.length;++j) {
				if(s==arr[i]+arr[j]) {
					System.out.println(arr[i]+", "+arr[j]);
				}
			}
		}
	}
	
	//基于排序，二分查找
	public static void printTwoNum2(int[] arr,int s) {
		for(int i =0;i<arr.length;++i) {
			int tmp = s - arr[i];
			
			//二分查找在剩下的数组中查找值=tmp的元素，找到即打印
			
			boolean flag = findByBinary(arr, tmp,i+1);
			if(flag)
				System.out.println(arr[i]+", "+tmp);
		}
	}
	
	public static boolean findByBinary(int[] arr,int value,int startIndex) {
		if(startIndex>arr.length-1)
			return false;
		
		int low = startIndex;
		if(startIndex==arr.length-1) {
			if(arr[startIndex]==value)
				return true;
			else
				return false;
		}
		
		int high = arr.length-1;
		int mid = (low+high)>>1;
			
		while(low<=high) {
			if(arr[mid]>value)
				high = mid-1;
			else if(arr[mid]<value)
				low = mid +1;
			else
				return true;
			
			mid = (low+high)>>1;
		}
		
		return false;
	}
	
	//两个指针指向数组的开始和末尾，向中间逼近
	public static void printTwoNum3(int[] arr,int s) {
		for(int i = 0,j=arr.length-1;	i<arr.length && j>i;	) {
			
			if(arr[i]+arr[j]==s) {
				System.out.println(arr[i]+", "+arr[j]);
				i++;
			}else if(arr[i]+arr[j]<s) {
				i++;
			}else {
				j--;
			}
		}
	}
	
}

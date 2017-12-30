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
			if(high==low+1) {//�ҵ�����Сֵ
				mid=high;
				break;
			}
			
			mid = (low+high)>>1;
			//���low��high��mid�����±�������ֵ����ȣ�ֻ��ͨ��˳�����low��high֮�������С��ֵ
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

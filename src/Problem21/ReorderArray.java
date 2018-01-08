package Problem21;

public class ReorderArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,3,5,6,7};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
		
		ReorderOddBeforeEven(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
	}
	
	public static void ReorderOddBeforeEven(int[] arr) {
		int low = 0;
		int high = arr.length-1;
		
		while(low<high) {
			
			//����ƶ�low��ֱ��arr[low]ָ��һ��ż��
			while(low<high && ((arr[low] & 0x1) == 1 )) {
				low++;
			}
			
			//��ǰ�ƶ�high��ֱ��arr[high]ָ��һ������
			while(low<high && ((arr[high] & 0x1) == 0 )) {
				high--;
			}
			
			if(low<high) {
				int tmp = arr[low];
				arr[low]=arr[high];
				arr[high]=tmp;
			}
		}
	}

}

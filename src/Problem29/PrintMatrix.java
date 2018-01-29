package Problem29;

public class PrintMatrix {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,4,5},{7,4,6,5,3},{2,9,2,1,5},{3,6,4,7,8}};
		printMatrixClock(arr);
	}

	private static void printMatrixClock(int[][] arr) {
		if(arr==null)
			return;
		int rows = arr.length;
		if(rows<=0)
			return;
		int columns = arr[0].length;
		if(columns<=0)
			return;
		
		int start = 0;
		while(start*2 <rows && start*2<columns) {//����<=
			printMatrixFromStart(arr,start);
			start++;
		}
	}

	private static void printMatrixFromStart(int[][] arr, int start) {
		int endRow = (arr.length -1) - start;
		int endColumn = (arr[0].length -1) - start;
		
		//�����Ҵ�ӡһ��
		for(int i = start;i<=endColumn;++i)
			System.out.print(arr[start][i]+"  ");
		System.out.println();
		
		//���ϵ��´�ӡһ��
		for (int i = start+1; i <= endRow; i++) 
			System.out.print(arr[i][endColumn]+"  ");
		System.out.println();
		
		//���ҵ����ӡһ��
		for (int i = endColumn-1; i >=start; i--)
			System.out.print(arr[endRow][i]+"  ");
		System.out.println();
		
		//���µ��ϴ�ӡһ��
		for (int i = endRow-1; i >start; i--) 
			System.out.print(arr[i][start]+"  ");
		System.out.println();
	}
	
	

}

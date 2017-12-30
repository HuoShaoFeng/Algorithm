package Problem47;

public class MostGift {

	public static void main(String[] args) {
		
		int[][] arr = { {2,3,3,8},
						{3,2,9,6},
						{5,7,3,11},
//						{3,7,6,5}
					   };
		
		int maxGift = getMaxGift(arr);
		System.out.println("maxGift = " + maxGift);
	}

	private static int getMaxGift(int[][] arr) {
		
		int rows = arr.length;
		int cols = arr[0].length;
		
		int[][] retArr = new int[rows][cols];
		
		//��ʼ����һ�� 
		for(int i = 0,j=0;j<cols;++j) {
			if(j==0)
				retArr[i][j] = arr[i][j];
			else if(j>0)
				retArr[i][j] = retArr[i][j-1] +arr[i][j];
		}
		//��ʼ����һ��
		for(int i = 0,j=0;i<rows;++i) {
			if(i==0)
				retArr[i][j] = arr[i][j];
			else if(i>0) {
				retArr[i][j] = retArr[i-1][j] + arr[i][j];
			}
		}
		
		//�ڶ��еڶ��п�ʼ ����ÿ�����ӵ��������ֵ
		int tmp = 0;
		for(int i=1;i<rows;i++) {
			for (int j = 1; j < cols; j++) {
				//�õ����������ϱߵĽϴ�ֵ
				tmp = retArr[i-1][j]>retArr[i][j-1]?retArr[i-1][j]:retArr[i][j-1];
				retArr[i][j] = tmp +arr[i][j];
			}
		}
		
//		for (int[] is : retArr) {
//			System.out.println();
//			for (int i : is) {
//				System.out.print(i+", ");
//			}
//		}
		
		return retArr[rows-1][cols-1];
	}

}

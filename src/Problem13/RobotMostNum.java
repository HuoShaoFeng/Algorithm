package Problem13;

public class RobotMostNum {
	private static final int ROW = 100;
	private static final int COL = 100;

	public static void main(String[] args) {
		int[][] arr = new int[ROW][COL];
		int thredhold = 9;
		System.out.println(getCount(arr, thredhold));
		System.out.println(((thredhold+1)*(thredhold+2))/2);
	}
	
	public static int getCount(int[][] arr, int threshold) {
		if(threshold<0 || arr==null)
			return 0;
		
		boolean[][] visited = new boolean[ROW][COL];
		int count = getCountCore(arr,0,0,visited,threshold);
		return count;
	}

	public static int getCountCore(int[][] arr, int i, int j, boolean[][] visited,int threshold) {
		int count = 0;
		if(i>=0&&i<=ROW-1&&j>=0&&j<=COL-1 && visited[i][j]==false && getRowColSum(i,j)<=threshold) {
			visited[i][j]=true;
			count = 1 + getCountCore(arr, i, j-1, visited, threshold)+
					getCountCore(arr, i, j+1, visited, threshold)+
					getCountCore(arr, i-1, j, visited, threshold)+
					getCountCore(arr, i+1, j, visited, threshold);
		}
		
		return count;
	}

	public static int getRowColSum(int i, int j) {
		int sum = 0;
		while(i!=0) {
			sum += i%10;
			i/=10;
		}
		while(j!=0) {
			sum += j%10;
			j/=10;
		}
		return sum;
	}

}

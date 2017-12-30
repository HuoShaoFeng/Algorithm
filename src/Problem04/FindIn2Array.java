package Problem04;

public class FindIn2Array {

	public static void main(String[] args) {
		int[][] arr = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		
		System.out.println(findornot(arr, 5));
	}
	
	public static boolean findornot(int[][] arr,int value){

		int rows = arr.length;
		int cols = arr[0].length;
		
		//从右上角开始查找
		for (int i = 0, j = cols-1; i < rows && j >=0; ) {
			
				if(arr[i][j]<value){
					i++;
				}
				else if(arr[i][j]>value){
					j--;
				}
				else
					return true;
		}
		
		return false;
	}
	
	

}

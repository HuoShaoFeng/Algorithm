package Problem63;

public class MaxProfitOfStock {

	public static void main(String[] args) {
		int[] arr = new int[] {9,11,8,15,27,32,19,14};
		
		int maxProfit = getMaxProfit(arr);
		System.out.println("最大利润是："+maxProfit);

	}
	
	public static int getMaxProfit(int[] arr) {
		
		int minV = arr[0];
		int maxP = arr[0] - minV;
		int maxIndex = 0;
		
		for(int i= 1 ; i<arr.length;++i) {
			if(minV > arr[i])
				minV = arr[i];
			if(arr[i]-minV > maxP) {
				maxP = arr[i]-minV;
				maxIndex = i;
			}
		}
		System.out.println("抄底价："+minV+", 转出价："+arr[maxIndex]);
		return maxP;
	}

}

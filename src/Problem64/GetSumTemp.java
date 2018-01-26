package Problem64;

/**
 * 不使用加减乘除
 * 不使用for while等循环方式
 * 求1-n之间的和
 * @author huosf
 *
 */
public class GetSumTemp {
	
	public static void main(String[] args) {
//		GetSum[] arr = new GetSum[5];
		GetSum arr1 = new GetSum();
		GetSum arr2 = new GetSum();
		GetSum arr3 = new GetSum();
		new GetSum();
		new GetSum();

		
		int sum = GetSum.getTheSum();
		System.out.println(sum);
	}
}

class GetSum {
	
	public static int n = 0;
	public static int sum = 0;
	
	public GetSum() {
		n++;
		sum+=n;
	}
	
	public static int getTheSum() {
		return sum;
	}
	
}




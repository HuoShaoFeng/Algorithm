package Problem49;

/**
 * 丑数：只含有因子2、3、5
 * 求从小到大的第1500个丑数，1是第一个丑数
 */
public class UglyNumber {

	public static void main(String[] args) {

		int n=14;
		System.out.println(getNthUglyNum(n));
		

	}

	private static int getNthUglyNum(int index) {
		if(index<1)
			return 0;
		int[] uglys = new int[index];
		uglys[0]=1;
		int nextUglyIndex = 1;
		
		int index2 = 0;
		int index3 = 0;
		int index5 = 0;
		
		while(nextUglyIndex<index) {
			int mintmp = uglys[index2]*2>uglys[index3]*3 ? uglys[index3]*3 : uglys[index2]*2 ;
			int min = mintmp>uglys[index5]*5 ? uglys[index5]*5 : mintmp;
			
			uglys[nextUglyIndex]=min;
			while(uglys[index2]*2<=uglys[nextUglyIndex])
				index2++;
			while(uglys[index3]*3<=uglys[nextUglyIndex])
				index3++;
			while(uglys[index5]*5<=uglys[nextUglyIndex])
				index5++;
			
			nextUglyIndex++;
			
		}
		
		int ugly = uglys[nextUglyIndex-1];
		
		
		return ugly;
	}

}

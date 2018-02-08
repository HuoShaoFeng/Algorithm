package Problem44;

public class DigitOfIndex {

	public static void main(String[] args) {
		int n = 1001;
		System.out.println(digitAtIndex(n));

	}

	private static int digitAtIndex(int n) {
		if(n<0)
			return -1;
		int digit =1;
		while(true) {
			int num = countOfInteger(digit);
			if(n<num*digit)
				return digitAtIndex(n,digit);
			n = n - digit*num;
			digit++;
		}
//		return -1;
	}

	private static int digitAtIndex(int n, int digit) {
		int number = beginNumber(digit)+n/digit;
		int indexFromRight = digit - n%digit;
		for(int i=1;i<indexFromRight;++i)
			number/=10;
		return number%10;
	}

	private static int beginNumber(int digit) {
		if(digit==1)
			return 0;
		return (int) Math.pow(10, digit-1);
	}

	//1位数：0-9,10个；2位数：10-99,9*10个；3位数：100-999,9*100个
	private static int countOfInteger(int n) {
		if(n==1)
			return 10;
		int count = (int) Math.pow(10,n-1);
		return 9*count;
	}

}

package Problem43;

public class AppearTimesOfOne {
	public static void main(String[] args) {
		int n = 30000;
		System.out.println(apearTimesOf1(n));
	}

	private static int apearTimesOf1(int n) {
		if(n<1)
			return 0;
		
		int len = getLenOfNumber(n);
		if(len==1)
			return 1;
		
		int tmp = powerBaseOf10(len-1);
		int first = n/tmp;
		int firstOneNum = first==1?(n%tmp)+1:tmp;
		int otherOneNum = first *(len-1)*(tmp/10);
		return firstOneNum + otherOneNum + apearTimesOf1(otherOneNum%tmp);
				
	}

	private static int powerBaseOf10(int i) {
		return (int) Math.pow(10, i);
	}

	private static int getLenOfNumber(int n) {
		int len = 0;
		while(n!=0) {
			len++;
			n/=10;
		}
		return len;
	}

}

package Problem15;

public class TheNumberOf1InBinary {

	public static void main(String[] args) {

		int i =256;
		
		System.out.println(getCountsOf1InBinary(i));
	}

	public static int getCountsOf1InBinary(int i) {
		int count = 0;
		
		while(i!=0){
			count++;
			i = i&(i-1);
		}
		
		return count;
	}

}

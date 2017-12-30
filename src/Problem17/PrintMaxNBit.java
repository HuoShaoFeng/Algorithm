package Problem17;

public class PrintMaxNBit {

	public static void main(String[] args) {
		Print1ToMaxN(5);
	}
	
	public static void Print1ToMaxN(int n) {
		if(n<=0)
			return;
		
		char[] num = new char[n];
		for (int i = 0; i < 10; i++) {
			num[0] = (char) ('0'+i);
			Print1ToMaxNRecursively(num,n,0);
		}
	}

	public static void Print1ToMaxNRecursively(char[] num, int len, int index) {
		if(index == len-1) {
			printNum(num);
			return;
		}
		for(int i=0;i<10;++i) {
			num[index+1]=(char) (i+'0');
			Print1ToMaxNRecursively(num, len, index+1);
		}
	}

	public static void printNum(char[] num) {
		int index=0;
		for (int i = 0; i < num.length; i++) {
			if(num[i]!='0') {
				index=i;
				break;
			}
		}
		
		//全是0 则不打印
		if(0==Integer.parseInt(new String(num)))
			return;
		
		for(int i=index;i<num.length;++i) {

			System.out.print(num[i]);
		}
		System.out.println();
	}
}

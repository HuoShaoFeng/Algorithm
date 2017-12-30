package Problem10;

public class Fibonacci {

	
	public static void main(String[] args) {

		int ret = getNFibonacci2(44);
		System.out.println(ret);
	}

	public static int getNFibonacci(int i) {
		if(i<=0)
			return 0;
		if(i==1)
			return 1;
		
		return getNFibonacci(i-2)+getNFibonacci(i-1);
	}
	
	public static int getNFibonacci2(int n) {
		if(n<=0) 
			return 0;
		if(n==1)
			return 1;
		
		int fn = 0;
		int f1 = 0;
		int f2 = 1;
		
		for(int i=2;i<=n;++i) {
			fn = f1+f2;
			f1 = f2;
			f2 = fn;
		}
		return fn;
	}
	
	

}

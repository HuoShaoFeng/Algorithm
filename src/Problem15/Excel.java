package Problem15;

public class Excel {

	public static void main(String[] args) {
		String str="BAD";
		System.out.println(getInt(str));
	}

	public static int getInt(String str) {
		int ret = 0;
		int length = str.length();
		for(int i=length-1;i>=0;--i) {
			ret += (str.charAt(i)-'A'+1) * Math.pow(26, length-1-i);
		}
		return ret;
	}

}

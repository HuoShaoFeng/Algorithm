package Problem46;

/**
 * 把数字翻译成字符串：
 * 0-->a
 * 1-->b
 * ......
 * 25-->z
 * 返回可能的种数
 */
public class NumberToString {

	public static void main(String[] args) {
		int num = 122;
		System.out.println(getKinds(num));

	}

	private static int getKinds(int num) {
		String str = num+"";
		
		//从后向前 统计可能的种数
		int[] counts = new int[str.length()];
		
		int count = 0;
		for(int i=str.length()-1;i>=0;--i) {
			count = 0;
			
			if(i<str.length()-1)
				count = counts[i+1];
			else
				count = 1;
			
			if(i<str.length()-1) {
				int d1 = str.charAt(i)-'0';
				int d2 = str.charAt(i+1)-'0';
				int tmp = d1*10+d2;
				if(tmp>=10 && tmp<=25) {
					if(i<str.length()-2)
						count += counts[i+2];
					else
						count = count +1;
				}
			}
			counts[i]=count;
		}
		return counts[0];
		
		
		
		
	}

}

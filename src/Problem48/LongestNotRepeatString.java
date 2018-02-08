package Problem48;

public class LongestNotRepeatString {

	public static void main(String[] args) {
		String str = "acadbaeaa";
		System.out.println("longest = "+getLongestNotRepeat(str));
		
	}

	private static int getLongestNotRepeat(String str) {
		
		int curLen = 0;
		int maxLen = 0;
		int[] pos = new int[26];
		for(int i=0;i<26;++i)
			pos[i]=-1;
		
		for (int i = 0; i < str.length(); i++) {
			//pre记录了当前第i个字符上次出现的位置
			int pre = pos[str.charAt(i)-'a'];
			
			if(pre<0 || i-pre > curLen) {
				curLen++;
			}
			else {
				if(curLen>maxLen)
					maxLen = curLen;
				curLen = i-pre;
			}
			pos[str.charAt(i)-'a']=i;
			
		}
		return curLen>maxLen?curLen:maxLen;

		
	}

}

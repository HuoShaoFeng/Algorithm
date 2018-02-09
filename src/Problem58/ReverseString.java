package Problem58;

public class ReverseString {

	public static void main(String[] args) {
		String str = "woshi I am a student. really";
		
		//输出
		System.out.println(reverseWordOrder(str));

	}

	private static String reverseWordOrder(String str) {
		if(str==null)
			return "";
		char[] charArray = str.toCharArray();
		if(charArray.length<=1)
			return new String(charArray);
		
		//翻转整个句子
		reverse(charArray, 0, charArray.length-1);
		System.out.println(new String(charArray));
		
		
		//翻转每个单词
		int start = 0;
		int end = 0;
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]==' ') {
				end = i-1;
				reverse(charArray, start, end);
				start=i+1;
			}
			if(i==charArray.length-1) {//易错：最后一个单词
				reverse(charArray, start, i);
			}
		}
		return new String(charArray);
	}
	
	//翻转一段字符串
	public static void reverse(char[] carr,int start,int end) {
		if(carr==null || carr.length<1)
			return;
		if(start<0 || end <0 || start>=end)
			return;
		
		while(start<end) {
			char tmp = carr[start];
			carr[start]=carr[end];
			carr[end]=tmp;
			start++;
			end--;
		}
		
	}

}

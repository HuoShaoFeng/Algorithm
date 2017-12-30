package Problem05;

public class ReplaceSpace {

	public static void main(String[] args) {

		String str = "  We are hap py! ";
		 
		System.out.println(Replace_Space(str));
		
	}

	private static String Replace_Space(String str) {
		char[] arr = str.toCharArray();
		int count_Space = 0;
		
		//计算字符串中空格的个数
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==' ')
				count_Space++;
		}
	
		char[] retArr = new char[arr.length+count_Space*2];
		int j  = retArr.length-1;
		//倒序遍历，给新字符数组赋值
		for (int i = arr.length-1; i >=0; i--) {
			if(arr[i]!=' ')
				retArr[j--]=arr[i];
			else{
				retArr[j--]='0';
				retArr[j--]='2';
				retArr[j--]='%';
			}
		}
		return new String(retArr);
	}
	

}

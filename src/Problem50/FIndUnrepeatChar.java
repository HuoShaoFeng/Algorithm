package Problem50;

public class FIndUnrepeatChar {
	
	public static void main(String[] args) {
		String str = "paebbaccdff";
		System.out.println(getUnrepeatChar(str));
	}

	private static char getUnrepeatChar(String str) {
		if(str==null || str.length()<1)
			return ' ';
		
		int size = 256;
		int[] arr = new int[size];
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;++i) {
			arr[charArray[i]]++;
		}
		
		
		for(int i=0;i<charArray.length;++i) {
			if(arr[charArray[i]]==1)
				return charArray[i];
		}
		return '0';
	}


}

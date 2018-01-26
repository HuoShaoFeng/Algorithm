package Problem20;

public class NumberValid {

	public static void main(String[] args) {
		String str = "5e2";
		System.out.println(isNumber(str));
	}
	
	
	
	public static boolean isNumber(String str) {
		if(str==null)
			return false;
		
		boolean numberic = false;
		numberic = scanInteger(str);
		
		int i=0;
		
		if(str.charAt(i)=='.') {
			++i;
			str = str.substring(i);
			//
			numberic = scanUnsignedInteger(str) || numberic;
		}
		
		i=0;
		if(str.charAt(i)=='E' || str.charAt(i)=='e' ) {
			i++;
			str.substring(i);
			numberic = scanInteger(str)&&numberic;
		}
		
		return numberic && i==str.length()-1;
		
	}



	public static boolean scanInteger(String str) {

		int i = 0;
		if(str.startsWith("+") || str.startsWith("-"))
			str = str.substring(i+1);
		
		return scanUnsignedInteger(str);
	}



	public static boolean scanUnsignedInteger(String str) {
		int i=0;
		while(i<str.length() && str.charAt(i)>='0' && str.charAt(i)<='9') 
			i++;
		str = str.substring(i);
		return i!=0;
	}

}

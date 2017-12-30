package Problem16;

public class Power {

	public static void main(String[] args) {
		System.out.println(getPower(3.5, 2));
	}
	
	public static double getPower(double base,int exp) {
		double ret = 1;
		
		//0的负数次方，需要求0的倒数，无意义
		if(base>=-0.0000001 && base<=0.0000001 && exp<0) {
			return 0.0;
		}
		if(exp==0)//任何数的0次方=1
			return 1.0;
		
		int absExp = exp>0?exp:-exp;
		ret = getPowerCore( base, absExp);
		if(exp<0)
			ret = 1.0/ret;
		
		return ret;
	}

	public static double getPowerCore(double base, int absExp) {
		double ret = 1;
		if(1==absExp)
			return base;
		
		ret = getPowerCore(base, absExp>>1);
		ret *= ret;
		if((absExp & 0x1) == 1)//奇数
			ret *= base;
		
		return ret;
	}

}

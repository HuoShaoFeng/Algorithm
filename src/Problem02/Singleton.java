package Problem02;

public class Singleton {
	private Singleton(){
	}
	
	private static final Singleton ins = new Singleton();
	
	public static Singleton getInstance(){
		return ins;
	}
}	
	
	
	
//    public static Singleton ins=null;
//    
//    static {	//��̬����飬ֻ�������ʱִ��һ��
//        ins = new Singleton();
//    }
//    private Singleton(){
//    }
//    public static Singleton getIns() {
//        return ins;
//    }

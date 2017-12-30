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
//    static {	//静态代码块，只在类加载时执行一次
//        ins = new Singleton();
//    }
//    private Singleton(){
//    }
//    public static Singleton getIns() {
//        return ins;
//    }

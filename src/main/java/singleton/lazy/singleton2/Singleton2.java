package singleton.lazy.singleton2;

/**
 * 单例模式-- 内部类懒汉式
 * @author 19117
 * @date 2019/11/05
 */
public class Singleton2 {
    private Singleton2(){
    }
    public static Singleton2 getInstance(){
        return Inner.INSTANCE;
    }
    private static class Inner{
        private final static Singleton2 INSTANCE = new Singleton2();
    }
}

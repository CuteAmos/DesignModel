package singleton.hungry.singleton;

/**
 * 单例模式---饿汉式
 * @author 19117
 * @date 2019/11/05
 */
public class Singleton {
    private final static Singleton INSTANCE = new Singleton();

    private Singleton() {
    }
    public static Singleton getInstance(){
        return INSTANCE;
    }
}

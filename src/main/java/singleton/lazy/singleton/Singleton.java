package singleton.lazy.singleton;

/**
 * 单例模式---懒汉式
 * @author 19117
 * @date 2019/11/05
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                    return instance;
                }
            }
        }
        return instance;
    }

}

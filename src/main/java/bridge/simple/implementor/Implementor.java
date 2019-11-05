package bridge.simple.implementor;

/**
 * 桥接模式: 将抽象部分与实现部分分离，使他们都可以独立地变化。
 * 实现部分的父类
 * @author 19117
 * @date 2019/11/05
 */
public abstract class Implementor {
    /**
     * 实现部分的接口
     */
    public abstract void operation();
}

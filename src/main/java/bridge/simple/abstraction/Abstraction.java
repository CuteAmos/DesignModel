package bridge.simple.abstraction;

import bridge.simple.implementor.Implementor;

/**
 * 抽象部分的父类
 * @author 19117
 * @date 2019/11/05
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    /**
     * 抽象部分的接口
     */
    public abstract void operation();
}

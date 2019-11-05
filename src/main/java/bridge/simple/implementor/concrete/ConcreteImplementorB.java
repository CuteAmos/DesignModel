package bridge.simple.implementor.concrete;

import bridge.simple.implementor.Implementor;

public class ConcreteImplementorB extends Implementor {
    @Override
    public void operation() {
        System.out.println("ConcreteImplementorB 的具体实现方法执行了。。。");
    }
}

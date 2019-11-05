package bridge.simple.implementor.concrete;

import bridge.simple.implementor.Implementor;


public class ConcreteImplementorA extends Implementor {
    @Override
    public void operation() {
        System.out.println("ConcreteImplementorA 的具体实现方法执行了。。。");
    }
}

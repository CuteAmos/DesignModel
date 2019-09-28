package test.decorator;

import decorator.simpleDecorator.concrete.ConcreteComponent;
import decorator.simpleDecorator.decorator.concrete.ConcreteDecoratorA;
import decorator.simpleDecorator.decorator.concrete.ConcreteDecoratorB;
import org.junit.Test;

public class SimpleDecoratorTest {
    @Test
    public void testSimpleDecorator(){
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB();
        decoratorA.setComponent(c);
        decoratorB.setComponent(decoratorA);
        decoratorB.operation();
//        ConcreteComponent 具体对象
//        ConcreteDecoratorA 进行 装饰
//        ConcreteDecoratorB 进行了装饰
    }
}

package decorator.simpleDecorator.decorator.concrete;

import decorator.simpleDecorator.decorator.Decorator;

public class ConcreteDecoratorA extends Decorator {

    @Override
    public void operation() {
        super.operation();
        System.out.println("ConcreteDecoratorA 进行 装饰");
    }
}

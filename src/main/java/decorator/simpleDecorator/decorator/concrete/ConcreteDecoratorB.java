package decorator.simpleDecorator.decorator.concrete;

import decorator.simpleDecorator.decorator.Decorator;

public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation() {
        super.operation();
        System.out.println("ConcreteDecoratorB 进行了装饰");
    }
}

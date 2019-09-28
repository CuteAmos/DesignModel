package decorator.simpleDecorator.concrete;

import decorator.simpleDecorator.IComponent;

public class ConcreteComponent implements IComponent {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent 具体对象");
    }
}

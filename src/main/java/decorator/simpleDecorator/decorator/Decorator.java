package decorator.simpleDecorator.decorator;

import decorator.simpleDecorator.IComponent;

public class Decorator implements IComponent {

    private IComponent component = null;

    public void setComponent(IComponent component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if(component != null)component.operation();
    }
}

package bridge.simple.abstraction.refined;

import bridge.simple.abstraction.Abstraction;


public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        implementor.operation();
    }
}

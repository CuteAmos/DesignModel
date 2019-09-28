package test.strategy;

import org.junit.Test;
import strategy.simpleStrategy.concreteStrategy.ConcreteStrategy1;
import strategy.simpleStrategy.context.Context;

public class SimpleStrategyTest {
    @Test
    public void testSimpleStrategy(){
        Context context = new Context();
        context.setStrategy(new ConcreteStrategy1());
        context.ContextInterface();
    }

}

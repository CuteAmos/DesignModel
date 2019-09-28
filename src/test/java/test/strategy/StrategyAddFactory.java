package test.strategy;

import org.junit.Test;
import strategy.strategyAddFactory.context.Context2;

public class StrategyAddFactory {
    @Test
    public  void  testStrategyAddFactory(){
        Context2 context2 = new Context2("2");
        context2.ContextInterface();
    }

}

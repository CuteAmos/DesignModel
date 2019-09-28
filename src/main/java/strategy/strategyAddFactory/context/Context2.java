package strategy.strategyAddFactory.context;


import strategy.strategyAddFactory.IStrategy2;
import strategy.strategyAddFactory.concreteStrategy.ConcreteStrategy1;
import strategy.strategyAddFactory.concreteStrategy.ConcreteStrategy2;

public class Context2 {
    private IStrategy2 strategy;

    public Context2(String type) {
        if (type.equals("1")) strategy = new ConcreteStrategy1();
        else strategy = new ConcreteStrategy2();
    }

    /**
     * 根据不同策略，执行不同算法
     */
    public void ContextInterface() {
        strategy.AlgorithmInterface();
    }

}

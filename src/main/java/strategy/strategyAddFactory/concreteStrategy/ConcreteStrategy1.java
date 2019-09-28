package strategy.strategyAddFactory.concreteStrategy;

import strategy.strategyAddFactory.IStrategy2;

public class ConcreteStrategy1 implements IStrategy2 {
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法 1 实现");
    }
}

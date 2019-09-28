package strategy.simpleStrategy.concreteStrategy;

import strategy.simpleStrategy.IStrategy;

public class ConcreteStrategy2 implements IStrategy {
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法 2 实现");
    }
}

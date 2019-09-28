package strategy.simpleStrategy.concreteStrategy;

import strategy.simpleStrategy.IStrategy;

public class ConcreteStrategy1 implements IStrategy {
    @Override
    public void AlgorithmInterface() {
        System.out.println("算法 1 实现");
    }
}

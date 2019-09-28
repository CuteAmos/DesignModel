package strategy.simpleStrategy.context;

import strategy.simpleStrategy.IStrategy;

public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }
    public Context() {
    }

    public IStrategy getStrategy() {
        return strategy;
    }
    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     *     根据不同策略，执行不同算法
     */
    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }
}

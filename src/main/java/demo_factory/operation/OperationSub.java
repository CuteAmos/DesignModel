package demo_factory.operation;

import demo_factory.Operation;

public class OperationSub extends Operation {
    @Override
    public double getRes() {
        return getNum1() - getNum2();
    }
}

package factory.simpleFactory.operation;

import factory.simpleFactory.Operation;

public class OperationSub extends Operation {
    @Override
    public double getRes() {
        return getNum1() - getNum2();
    }
}

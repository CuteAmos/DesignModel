package demo.operation;

import demo.Operation;

public class OperationSub extends Operation {
    @Override
    public double getRes() {
        return getNum1() - getNum2();
    }
}

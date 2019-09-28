package demo.operation;

import demo.Operation;

public class OperationMul extends Operation {
    @Override
    public double getRes() {
        return getNum1() * getNum2();
    }
}

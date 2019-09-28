package demo.operation;

import demo.Operation;

public class OperationAdd extends Operation {
    @Override
    public double getRes() {
        return getNum1()+getNum2();
    }
}

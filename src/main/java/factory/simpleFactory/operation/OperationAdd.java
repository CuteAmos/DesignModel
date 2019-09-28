package factory.simpleFactory.operation;

import factory.simpleFactory.Operation;

public class OperationAdd extends Operation {
    @Override
    public double getRes() {
        return getNum1()+getNum2();
    }
}

package demo.operation;

import demo.Operation;

public class OperationDiv extends Operation {
    @Override
    public double getRes() {
        if(getNum2() != 0)  return getNum1()/getNum2();
       else throw new ArithmeticException("被除数（num2）不能为 0");
    }
}

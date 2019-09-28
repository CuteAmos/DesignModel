package demo_factory.factory;

import demo_factory.Operation;
import demo_factory.operation.OperationAdd;
import demo_factory.operation.OperationDiv;
import demo_factory.operation.OperationMul;
import demo_factory.operation.OperationSub;

public class OperationFactory {
    public static Operation createOperation(String operator){
        Operation operation = null;
        switch(operator){
            case "+":operation = new OperationAdd();break;
            case "-":operation = new OperationSub();break;
            case "*":operation = new OperationMul();break;
            case "/":operation = new OperationDiv();break;
        }
        return operation;
    }
}

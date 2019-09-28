package factory.simpleFactory.factory;

import factory.simpleFactory.Operation;
import factory.simpleFactory.operation.OperationAdd;
import factory.simpleFactory.operation.OperationDiv;
import factory.simpleFactory.operation.OperationMul;
import factory.simpleFactory.operation.OperationSub;

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

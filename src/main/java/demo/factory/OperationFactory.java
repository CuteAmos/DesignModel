package demo.factory;

import demo.Operation;
import demo.operation.OperationAdd;
import demo.operation.OperationDiv;
import demo.operation.OperationMul;
import demo.operation.OperationSub;

public class OperationFactory {
    public static Operation cerateOperation(String operator){
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

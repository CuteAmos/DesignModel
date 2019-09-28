package test.factory;

import demo.Operation;
import demo.factory.OperationFactory;
import org.junit.Test;

public class FactoryTest {
    @Test
    public void testOperation(){
        Operation operation = OperationFactory.cerateOperation("/");
        operation.setNum1(20d);
        System.out.println(operation.getRes());
    }


}

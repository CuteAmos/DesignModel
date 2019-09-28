package test.factory;

import demo_factory.Operation;
import demo_factory.factory.OperationFactory;
import org.junit.Test;

public class FactoryTest {
    @Test
    public void testOperation(){
        Operation operation = OperationFactory.createOperation("/");
        operation.setNum1(20d);
        System.out.println(operation.getRes());
    }


}

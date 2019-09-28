package test.factory;

import factory.simpleFactory.Operation;
import factory.simpleFactory.factory.OperationFactory;
import org.junit.Test;

public class SimpleFactoryTest {
    @Test
    public void testSimpleFactory(){
        Operation operation = OperationFactory.createOperation("/");
        operation.setNum1(20d);
        System.out.println(operation.getRes());
    }
}

package test.factory;

import factory.factoryMethod.factory.IFactory;
import factory.factoryMethod.factory.impl.ConcreteFactory1;
import factory.factoryMethod.product.IProduct;
import org.junit.Test;

public class FactoryMethodTest {
    @Test
    public void testFactoryMethod(){
        IFactory concreteFactory = new ConcreteFactory1();
        IProduct product = concreteFactory.createProduct();
        product.display();
    }

}

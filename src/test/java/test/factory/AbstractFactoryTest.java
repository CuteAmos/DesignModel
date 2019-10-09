package test.factory;

import factory.abstractFactory.factory.IFactory;
import factory.abstractFactory.factory.impl.ConcreteFactory1;
import factory.abstractFactory.product.productA.IProductA;
import factory.abstractFactory.product.productB.IProductB;
import org.junit.Test;

public class AbstractFactoryTest {
    @Test
    public void testAbstractFactory(){
        IFactory factory1 = new ConcreteFactory1();
        IProductA productA = factory1.createProductA();
        productA.display();
        IProductB productB = factory1.createProductB();
        productB.display();
    }

}

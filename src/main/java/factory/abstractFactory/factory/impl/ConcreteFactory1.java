package factory.abstractFactory.factory.impl;

import factory.abstractFactory.factory.IFactory;
import factory.abstractFactory.product.productA.IProductA;
import factory.abstractFactory.product.productA.impl.ProductA1;
import factory.abstractFactory.product.productB.IProductB;
import factory.abstractFactory.product.productB.impl.ProductB1;

public class ConcreteFactory1 implements IFactory {
    @Override
    public IProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public IProductB createProductB() {
        return new ProductB1();
    }
}

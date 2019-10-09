package factory.abstractFactory.factory.impl;

import factory.abstractFactory.factory.IFactory;
import factory.abstractFactory.product.productA.IProductA;
import factory.abstractFactory.product.productA.impl.ProductA2;
import factory.abstractFactory.product.productB.IProductB;
import factory.abstractFactory.product.productB.impl.ProductB2;

public class ConcreteFactory2 implements IFactory {
    @Override
    public IProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public IProductB createProductB() {
        return new ProductB2();
    }
}

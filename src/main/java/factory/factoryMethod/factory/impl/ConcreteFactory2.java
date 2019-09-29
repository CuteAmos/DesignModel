package factory.factoryMethod.factory.impl;

import factory.factoryMethod.factory.IFactory;
import factory.factoryMethod.product.IProduct;
import factory.factoryMethod.product.impl.ConcreteProduct2;

public class ConcreteFactory2 implements IFactory {
    @Override
    public IProduct createProduct() {
        return new ConcreteProduct2();
    }
}

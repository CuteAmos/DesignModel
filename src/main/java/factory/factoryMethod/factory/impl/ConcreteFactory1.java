package factory.factoryMethod.factory.impl;

import factory.factoryMethod.factory.IFactory;
import factory.factoryMethod.product.IProduct;
import factory.factoryMethod.product.impl.ConcreteProduct1;

public class ConcreteFactory1 implements IFactory {
    @Override
    public IProduct createProduct() {
        return new ConcreteProduct1();
    }
}

package factory.factoryMethod.product.impl;

import factory.factoryMethod.product.IProduct;

public class ConcreteProduct2 implements IProduct {
    @Override
    public void display() {
        System.out.println("ConcreteProduct2 展示");
    }
}

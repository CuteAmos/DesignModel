package factory.factoryMethod.product.impl;

import factory.factoryMethod.product.IProduct;

public class ConcreteProduct1 implements IProduct {

    @Override
    public void display() {
        System.out.println("ConcreteProduct1 展示");
    }
}

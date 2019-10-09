package factory.abstractFactory.product.productB.impl;

import factory.abstractFactory.product.productB.IProductB;

public class ProductB2 implements IProductB {
    @Override
    public void display() {
        System.out.println("ProductB2 的 display() 执行了。。。");
    }
}

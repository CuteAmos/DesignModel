package factory.abstractFactory.product.productB.impl;

import factory.abstractFactory.product.productB.IProductB;

public class ProductB1 implements IProductB {
    @Override
    public void display() {
        System.out.println("ProductB1 的 display() 执行了。。。");
    }
}

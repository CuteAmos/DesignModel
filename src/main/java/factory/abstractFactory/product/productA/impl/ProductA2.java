package factory.abstractFactory.product.productA.impl;

import factory.abstractFactory.product.productA.IProductA;

public class ProductA2 implements IProductA {
    @Override
    public void display() {
        System.out.println("ProductA2 的 display() 执行了。。。");
    }
}

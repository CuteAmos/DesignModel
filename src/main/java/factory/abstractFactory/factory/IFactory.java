package factory.abstractFactory.factory;

import factory.abstractFactory.product.productA.IProductA;
import factory.abstractFactory.product.productB.IProductB;

public interface IFactory {
    IProductA createProductA();
    IProductB createProductB();
}

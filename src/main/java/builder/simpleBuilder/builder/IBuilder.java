package builder.simpleBuilder.builder;

import builder.simpleBuilder.product.Product;

public interface IBuilder {
    void buildPartA();

    void buildPartB();

    Product getResult();
}

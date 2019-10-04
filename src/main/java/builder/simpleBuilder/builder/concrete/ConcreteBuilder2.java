package builder.simpleBuilder.builder.concrete;

import builder.simpleBuilder.builder.IBuilder;
import builder.simpleBuilder.product.Product;

public class ConcreteBuilder2 implements IBuilder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.addPart("组件M");
    }

    @Override
    public void buildPartB() {
        product.addPart("组件N");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

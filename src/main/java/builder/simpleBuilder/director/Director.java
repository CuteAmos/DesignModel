package builder.simpleBuilder.director;

import builder.simpleBuilder.builder.IBuilder;
import builder.simpleBuilder.product.Product;

public class Director {
    private IBuilder builder;

    public Director(IBuilder builder) {
        builder.buildPartA();
        builder.buildPartB();
        this.builder = builder;
    }

    public Product build(){
        return builder.getResult();
    }
}

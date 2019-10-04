package test.builder;

import builder.simpleBuilder.builder.concrete.ConcreteBuilder2;
import builder.simpleBuilder.director.Director;
import builder.simpleBuilder.product.Product;
import org.junit.Test;

public class SimpleBuilderTest {
    @Test
    public void testSimpleBuilder(){
        Director director = new Director(new ConcreteBuilder2());
        Product product = director.build();
        product.show();
    }
}

package test.flyweight;

import flyweight.simple.factory.FlyweightFactory;
import flyweight.simple.flyweight.IFlyweight;
import flyweight.simple.flyweight.concrete.UnsharedConcreteFlyweight;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author aixiaobai
 * @date 2019/11/7 22:52
 */
public class SimpleFlyweightTest {

    @Test
    public void testSimpleFlyweight(){
        int extrinsicState = 22;
        FlyweightFactory factory = new FlyweightFactory();
        IFlyweight x = factory.getFlyweight("X");
        x.operation(--extrinsicState);

        IFlyweight y = factory.getFlyweight("Y");
        y.operation(--extrinsicState);

        IFlyweight z = factory.getFlyweight("Z");
        z.operation(--extrinsicState);

        IFlyweight q = new UnsharedConcreteFlyweight();
        q.operation(--extrinsicState);
    }

}
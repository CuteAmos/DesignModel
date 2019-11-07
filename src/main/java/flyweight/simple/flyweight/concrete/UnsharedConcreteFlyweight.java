package flyweight.simple.flyweight.concrete;

import flyweight.simple.flyweight.IFlyweight;

/**
 * @author aixiaobai
 * @date 2019/11/7 22:43
 */
public class UnsharedConcreteFlyweight implements IFlyweight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("UnsharedConcreteFlyweight :"+extrinsicState);
    }
}

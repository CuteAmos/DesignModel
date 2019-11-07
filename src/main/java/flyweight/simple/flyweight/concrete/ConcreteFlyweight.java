package flyweight.simple.flyweight.concrete;

import flyweight.simple.flyweight.IFlyweight;

/**
 * @author aixiaobai
 * @date 2019/11/7 22:42
 */
public class ConcreteFlyweight implements IFlyweight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("SharedConcreteFlyweight :" + extrinsicState);

    }
}

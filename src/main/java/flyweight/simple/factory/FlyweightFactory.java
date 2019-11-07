package flyweight.simple.factory;

import flyweight.simple.flyweight.IFlyweight;
import flyweight.simple.flyweight.concrete.ConcreteFlyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author aixiaobai
 * @date 2019/11/7 22:38
 */
public class FlyweightFactory {
    private Map<String, IFlyweight> map = new HashMap<>();

    public FlyweightFactory() {
        map.put("X", new ConcreteFlyweight());
        map.put("Y", new ConcreteFlyweight());
        map.put("Z", new ConcreteFlyweight());
    }

    public IFlyweight getFlyweight(String key) {
        return map.get(key);
    }
}

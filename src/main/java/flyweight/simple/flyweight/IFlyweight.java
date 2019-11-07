package flyweight.simple.flyweight;

/**
 * 享元模式
 * 具体享元类接口
 * @author aixiaobai
 * @date 2019/11/7 22:35
 */
public interface IFlyweight {
    /**
     * 定义操作接口
     * @param extrinsicState 外部状态
     */
    void operation(int extrinsicState);
}

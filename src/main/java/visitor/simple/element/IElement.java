package visitor.simple.element;

import visitor.simple.visitor.IVisitor;

/**
 * 元素对象接口
 * @author aixiaobai
 * @date 2019/11/8 22:06
 */
public interface IElement {
    /**
     * 定义一个接受访问者的接口
     * @param visitor 访问者
     */
    void accept(IVisitor visitor);
}

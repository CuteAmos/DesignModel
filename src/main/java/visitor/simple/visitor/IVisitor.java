package visitor.simple.visitor;

import visitor.simple.element.concrete.ConcreteElement1;
import visitor.simple.element.concrete.ConcreteElement2;

/**
 * 访问者模式
 * 访问者接口
 * @author aixiaobai
 * @date 2019/11/8 22:05
 */
public interface IVisitor {
    /**
     * 访问元素1
     * @param element1 元素1
     */
    void visitConcreteElement1(ConcreteElement1 element1);

    /**
     * 访问元素2
     * @param element2 元素2
     */
    void visitConcreteElement2(ConcreteElement2 element2);
}

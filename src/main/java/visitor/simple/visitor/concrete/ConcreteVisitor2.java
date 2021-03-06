package visitor.simple.visitor.concrete;

import visitor.simple.element.concrete.ConcreteElement1;
import visitor.simple.element.concrete.ConcreteElement2;
import visitor.simple.visitor.IVisitor;

/**
 * @author aixiaobai
 * @date 2019/11/8 22:19
 */
public class ConcreteVisitor2 implements IVisitor {
    @Override
    public void visitConcreteElement1(ConcreteElement1 element1) {
        System.out.println(element1.getClass().getName()+"被"+this.getClass().getName());
    }

    @Override
    public void visitConcreteElement2(ConcreteElement2 element2) {
        System.out.println(element2.getClass().getName()+"被"+this.getClass().getName());
    }
}

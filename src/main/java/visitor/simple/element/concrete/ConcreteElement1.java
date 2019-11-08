package visitor.simple.element.concrete;

import visitor.simple.element.IElement;
import visitor.simple.visitor.IVisitor;

/**
 * @author aixiaobai
 * @date 2019/11/8 22:10
 */
public class ConcreteElement1 implements IElement {
    @Override
    public void accept(IVisitor visitor) {
        operation();
        visitor.visitConcreteElement1(this);
    }
    public void operation(){
        System.out.println("ConcreteElement1 具体操作");
    }
}

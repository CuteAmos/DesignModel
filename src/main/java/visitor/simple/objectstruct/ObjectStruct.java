package visitor.simple.objectstruct;

import visitor.simple.element.IElement;
import visitor.simple.visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aixiaobai
 * @date 2019/11/8 22:24
 */
public class ObjectStruct {
    private List<IElement> elements = new ArrayList<>();

    public void add(IElement element){
        elements.add(element);
    }

    public void remove(IElement element){
        elements.remove(element);
    }

    public void accept(IVisitor visitor){
        if(elements.size()>0){
            for (IElement element : elements) {
                element.accept(visitor);
            }
        }
    }
}

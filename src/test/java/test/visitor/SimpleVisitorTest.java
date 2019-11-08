package test.visitor;

import org.junit.Test;
import visitor.simple.element.concrete.ConcreteElement1;
import visitor.simple.element.concrete.ConcreteElement2;
import visitor.simple.objectstruct.ObjectStruct;
import visitor.simple.visitor.concrete.ConcreteVisitor1;

import static org.junit.Assert.*;

/**
 * @author aixiaobai
 * @date 2019/11/8 22:23
 */
public class SimpleVisitorTest {

    @Test
    public void testSimpleVisitor(){
        ObjectStruct objectStruct = new ObjectStruct();
        objectStruct.add(new ConcreteElement1());
        objectStruct.add(new ConcreteElement2());
        objectStruct.accept(new ConcreteVisitor1());
    }
}
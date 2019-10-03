package test.templateMethod;

import org.junit.Test;
import templateMethod.typicalTemplate.concrete.ConcreteClass;
import templateMethod.typicalTemplate.templateMethod.AbstractClass;

public class TypicalTemplateTest {
    @Test
    public void testTypicalTemplate(){
        AbstractClass typical = new ConcreteClass();
        typical.templateMethod();
    }
}

package test.composite;

import composite.simpleComposite.composite.Composite;
import composite.simpleComposite.leaf.Leaf;
import org.junit.Test;

public class SimpleCompositeTest {
    @Test
    public void testSimpleComposite(){
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));
        Composite compX  = new Composite("Comp X");
        root.add(compX);
        compX.add(new Leaf("Leaf XA"));
        compX.add(new Leaf("Leaf XB"));
        Composite compXY = new Composite("Comp XY");
        compX.add(compXY);
        compXY.add(new Leaf("Leaf XYA"));
        compXY.add(new Leaf("Leaf XYB"));
        compXY.add(new Leaf("Leaf XYC"));
        root.add(new Leaf("Leaf C"));
        root.display(1);
    }
}

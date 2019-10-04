package test.facade;

import facade.simpleFacade.facade.Facade;
import org.junit.Test;

public class SimpleFacadeTest {
    @Test
    public void testSimpleFacade() {
        Facade facade = new Facade();
        facade.methodA();
        System.out.println();
        facade.methodB();
    }
}

package test.bridge;

import bridge.simple.abstraction.Abstraction;
import bridge.simple.abstraction.refined.RefinedAbstraction;
import bridge.simple.implementor.Implementor;
import bridge.simple.implementor.concrete.ConcreteImplementorA;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleBridgeTest {
    @Test
    public void testSimpleBridge(){
        Abstraction abstraction = new RefinedAbstraction();
        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();
    }
}
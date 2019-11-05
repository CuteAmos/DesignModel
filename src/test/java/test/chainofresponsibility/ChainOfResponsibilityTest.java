package test.chainofresponsibility;

import chainofresponsibility.simple.handle.BaseHandle;
import chainofresponsibility.simple.handle.concrete.ConcreteHandleA;
import chainofresponsibility.simple.handle.concrete.ConcreteHandleB;
import chainofresponsibility.simple.handle.concrete.ConcreteHandleC;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author aixiaobai
 * @date 2019/11/5 23:50
 */
public class ChainOfResponsibilityTest {
    @Test
    public void testChainOfResponsibility(){
        BaseHandle handleA = new ConcreteHandleA();
        BaseHandle handleB = new ConcreteHandleB();
        BaseHandle handleC = new ConcreteHandleC();
        handleA.setSuccessor(handleB);
        handleB.setSuccessor(handleC);

        int[] requests = {2,3,9,15,18,20,25,30,36};
        for (int request : requests) {
            handleA.handleRequest(request);
        }
    }
}
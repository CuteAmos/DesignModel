package test.proxy;

import org.junit.Test;
import proxy.staticProxy.ISubject;
import proxy.staticProxy.proxy.SubjectProxy;

public class StaticProxyTest {
    @Test
    public void testStaticProxy(){
        ISubject subjectProxy = new SubjectProxy();
        subjectProxy.request();
    }
}

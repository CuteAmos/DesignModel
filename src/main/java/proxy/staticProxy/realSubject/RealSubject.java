package proxy.staticProxy.realSubject;

import proxy.staticProxy.ISubject;

public class RealSubject implements ISubject {
    @Override
    public void request() {
        System.out.println("这是一个真实的请求！");
    }
}

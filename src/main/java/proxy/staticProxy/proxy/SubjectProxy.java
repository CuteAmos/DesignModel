package proxy.staticProxy.proxy;

import proxy.staticProxy.ISubject;
import proxy.staticProxy.realSubject.RealSubject;

public class SubjectProxy implements ISubject {

    private RealSubject realSubject =null;
    @Override
    public void request() {
        System.out.println("代理方法开始：");
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();
        System.out.println("代理方法结束。");
    }
}
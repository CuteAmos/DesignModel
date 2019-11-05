package chainofresponsibility.simple.handle.concrete;

import chainofresponsibility.simple.handle.BaseHandle;
import chainofresponsibility.simple.request.RequestLevel;

/**
 * @author aixiaobai
 * @date 2019/11/5 23:46
 */
public class ConcreteHandleB extends BaseHandle {
    @Override
    public void handleRequest(int request) {
        if(request <= RequestLevel.LEVEL_B ){
            System.out.println("LEVEL_B:"+request+" 请求被处理了。。。");
        }else if(successor != null){
            successor.handleRequest(request);
        }
    }
}

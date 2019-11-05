package chainofresponsibility.simple.handle.concrete;

import chainofresponsibility.simple.handle.BaseHandle;
import chainofresponsibility.simple.request.RequestLevel;


/**
 * @author aixiaobai
 * @date 2019/11/5 23:26
 */
public class ConcreteHandleA extends BaseHandle {
    @Override
    public void handleRequest(int request) {
        if(request <= RequestLevel.LEVEL_A ){
            System.out.println("LEVEL_A:"+request+" 请求被处理了。。。");
        }else if(successor != null){
            successor.handleRequest(request);
        }
    }
}

package chainofresponsibility.simple.handle.concrete;

import chainofresponsibility.simple.handle.BaseHandle;
import chainofresponsibility.simple.request.RequestLevel;

/**
 * @author aixiaobai
 * @date 2019/11/5 23:47
 */
public class ConcreteHandleC extends BaseHandle {
    @Override
    public void handleRequest(int request) {
        if(request <= RequestLevel.LEVEL_C){
            System.out.println("LEVEL_C:"+request+" 请求被处理了。。。");
        }else if(successor != null){
            successor.handleRequest(request);
        }else{
            System.out.println("LEVEL:"+request+" 请求无法处理!!!");
        }
    }
}

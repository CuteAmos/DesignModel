package chainofresponsibility.simple.handle;


/**
 * 职责链模式
 * 处理请求的接口
 * @author aixiaobai
 * @date 2019/11/5 23:21
 */
public abstract class BaseHandle {
    protected BaseHandle successor;

    public void setSuccessor(BaseHandle successor) {
        this.successor = successor;
    }


    /**
     * 处理请求的抽象方法
     * @param request
     */
    public abstract void handleRequest(int request);
}

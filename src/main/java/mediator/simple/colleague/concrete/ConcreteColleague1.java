package mediator.simple.colleague.concrete;

import mediator.simple.colleague.BaseColleague;
import mediator.simple.mediator.IMediator;

/**
 * @author aixiaobai
 * @date 2019/11/7 21:38
 */
public class ConcreteColleague1 extends BaseColleague {
    public ConcreteColleague1(IMediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void receive(String message){
        System.out.println("ConcreteColleague1 接收到消息："+message);
    }
}

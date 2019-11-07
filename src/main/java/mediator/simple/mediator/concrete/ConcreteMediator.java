package mediator.simple.mediator.concrete;

import mediator.simple.colleague.BaseColleague;
import mediator.simple.colleague.concrete.ConcreteColleague1;
import mediator.simple.colleague.concrete.ConcreteColleague2;
import mediator.simple.mediator.IMediator;

/**
 * @author aixiaobai
 * @date 2019/11/7 21:44
 */
public class ConcreteMediator implements IMediator {
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void send(String message, BaseColleague colleague) {
        if(colleague == colleague1){
            colleague2.receive(message);
        }else{
            colleague1.receive(message);
        }
    }
}

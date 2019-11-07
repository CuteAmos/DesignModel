package test.mediator;

import mediator.simple.colleague.concrete.ConcreteColleague1;
import mediator.simple.colleague.concrete.ConcreteColleague2;
import mediator.simple.mediator.IMediator;
import mediator.simple.mediator.concrete.ConcreteMediator;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author aixiaobai
 * @date 2019/11/7 21:51
 */
public class SimpleMediatorTest {
    @Test
    public void testSimpleMediator(){
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 =new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.send("How are you?");
        colleague2.send("I'm fine.");
    }

}
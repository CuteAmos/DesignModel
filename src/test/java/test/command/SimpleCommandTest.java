package test.command;

import command.simple.command.BaseCommand;
import command.simple.command.concrete.ConcreteCommand;
import command.simple.invoker.Invoker;
import command.simple.receiver.Receiver;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author aixiaobai
 * @date 2019/11/5 22:55
 */
public class SimpleCommandTest {
    @Test
    public void testSimpleCommand(){
        BaseCommand command = new ConcreteCommand();
        command.setReceiver(new Receiver());
        Invoker invoker = new Invoker();

        invoker.setCommand(command);
        invoker.executeCommand();
    }

}
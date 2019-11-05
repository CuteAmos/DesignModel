package command.simple.command.concrete;

import command.simple.command.BaseCommand;

/**
 * @author aixiaobai
 * @date 2019/11/5 22:51
 */
public class ConcreteCommand extends BaseCommand {
    @Override
    public void execute() {
        receiver.action();
    }
}

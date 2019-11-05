package command.simple.invoker;

import command.simple.command.BaseCommand;

/**
 * @author aixiaobai
 * @date 2019/11/5 22:52
 */
public class Invoker {
    private BaseCommand command;

    public void setCommand(BaseCommand command) {
        this.command = command;
    }
    public void executeCommand(){
        command.execute();
    }
}

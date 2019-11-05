package command.simple.command;

import command.simple.receiver.Receiver;

/**
 * 命令模式
 * @author aixiaobai
 * @date 2019/11/5 22:47
 */
public abstract class BaseCommand {
    protected Receiver receiver;

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 执行命令接口
     */
    public abstract void execute();
}

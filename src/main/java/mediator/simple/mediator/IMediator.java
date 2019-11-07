package mediator.simple.mediator;

import mediator.simple.colleague.BaseColleague;

/**
 * 中介者模式（调停者模式）
 * 抽象中介者
 * @author aixiaobai
 * @date 2019/11/7 21:31
 */
public interface IMediator {
    /**
     *  发送消息接口
     * @param message 消息
     * @param colleague 发送方
     */
    void send(String message, BaseColleague colleague);
}

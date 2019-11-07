package mediator.simple.colleague;

import mediator.simple.mediator.IMediator;

/**
 * 抽象同事类
 * @author aixiaobai
 * @date 2019/11/7 21:32
 */
public  abstract class BaseColleague {
    protected IMediator mediator;

    public BaseColleague(IMediator mediator) {
        this.mediator = mediator;
    }
}

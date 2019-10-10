package state.simpleState.state.impl;

import state.simpleState.context.Context;
import state.simpleState.state.IState;

public class ConcreteStateB implements IState {

    @Override
    public void handle(Context context) {
        if (context.getFlag() < 10) {
            context.setState(new ConcreteStateB());
        } else {
            context.setState(new ConcreteStateC());
        }
    }
}

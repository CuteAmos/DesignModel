package state.simpleState.state.impl;

import state.simpleState.context.Context;
import state.simpleState.state.IState;

public class ConcreteStateA implements IState {

    @Override
    public void handle(Context context) {
        if (context.getFlag() < 5) {
            context.setState(new ConcreteStateA());
        } else {
            context.setState(new ConcreteStateB());
        }
    }
}

package state.simpleState.state.impl;

import state.simpleState.context.Context;
import state.simpleState.state.IState;

public class ConcreteStateC implements IState {

    @Override
    public void handle(Context context) {
            context.setState(new ConcreteStateC());
    }
}

package state.simpleState.state;

import state.simpleState.context.Context;

public interface IState {
    void handle(Context context);
}

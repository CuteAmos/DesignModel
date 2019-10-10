package state.simpleState.context;

import state.simpleState.state.IState;
import state.simpleState.state.impl.ConcreteStateA;

public class Context {
    private IState state = new ConcreteStateA();
    private int flag;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void request(){
        state.handle(this);
        if(state != null) System.out.println("当前标识符为："+flag+"\n当前状态为："+state.getClass().getName());
    }
}

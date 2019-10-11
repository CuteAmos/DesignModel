package memento.simpleMemento.originator;

import memento.simpleMemento.memento.Memento;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public Memento createMemento(){
        return new Memento(state);
    }
    public void setMemento(Memento memento){
        this.setState(memento.getState());
    }
    public void show(){
        System.out.println("当前state为："+state);
    }

}

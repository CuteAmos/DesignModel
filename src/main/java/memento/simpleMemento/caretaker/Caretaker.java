package memento.simpleMemento.caretaker;

import memento.simpleMemento.memento.Memento;

public class Caretaker {
    private Memento memento;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}

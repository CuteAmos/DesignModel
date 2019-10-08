package observer.simpleObserver.observer.impl;

import observer.simpleObserver.observer.IObserver;
import observer.simpleObserver.subject.Subject;

public class ConcreteObserver implements IObserver {
    private String state;
    private String name;
    private Subject subject;

    public ConcreteObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public ConcreteObserver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void update() {
        state = subject.getState();
        System.out.println("观察者"+name+"的状态为:"+state);
    }
}

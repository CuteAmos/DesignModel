package test.observer;

import observer.simpleObserver.observer.impl.ConcreteObserver;
import observer.simpleObserver.subject.Subject;
import observer.simpleObserver.subject.concrete.ConcreteSubject;
import org.junit.Test;

public class SimpleObserverTest {
    @Test
    public void testSimpleObserver(){
        Subject subject = new ConcreteSubject("ABC");
        subject.attach(new ConcreteObserver("X",subject));
        subject.attach(new ConcreteObserver("Y",subject));
        subject.attach(new ConcreteObserver("Z",subject));
        subject.toNotify();
    }
}

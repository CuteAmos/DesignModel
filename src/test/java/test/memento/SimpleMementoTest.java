package test.memento;

import memento.simpleMemento.caretaker.Caretaker;
import memento.simpleMemento.originator.Originator;
import org.junit.Test;

public class SimpleMementoTest {
    @Test
    public void testSimpleMemento(){
        Originator originator = new Originator();
        System.out.println("存档之前原始状态：");
        originator.setState("on");
        originator.show();
        // 存档
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        System.out.println("存档之后修改状态：");
        originator.setState("off");
        originator.show();
        System.out.println("读取存档状态：");
        originator.setMemento(caretaker.getMemento());
        originator.show();
    }
}

package test.state;

import org.junit.Test;
import state.simpleState.context.Context;

public class SimpleStateTest {
    @Test
    public void testSimpleState(){
        Context context = new Context();
//        context.setFlag(4);
//        context.request();
        context.setFlag(9);
        context.request();
    }
}

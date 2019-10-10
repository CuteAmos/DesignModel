package test.adapter;

import adapter.simpleAdapter.adapter.Adapter;
import adapter.simpleAdapter.target.Target;
import org.junit.Test;

public class SimpleAdapterTest {
    @Test
    public void testSimpleAdapter(){
        Target target = new Adapter();
        target.request();
    }
}

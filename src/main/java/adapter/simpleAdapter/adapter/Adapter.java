package adapter.simpleAdapter.adapter;


import adapter.simpleAdapter.adaptee.Adaptee;
import adapter.simpleAdapter.target.Target;

public class Adapter extends Target {
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}

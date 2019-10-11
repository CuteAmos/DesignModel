package composite.simpleComposite.component;

public abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void display(int depth);
}

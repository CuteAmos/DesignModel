package composite.simpleComposite.composite;

import composite.simpleComposite.component.Component;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public void display(int depth) {
        if (depth < 0) depth = 1;
        for (int i = 0; i < depth; i++) System.out.print("-");
        System.out.println("非叶子节点：" + this.getName());
        if (components.size() > 0) {
            depth++;
            for (Component component : components) {
                component.display(depth);
            }
        }
    }
}

package composite.simpleComposite.leaf;

import composite.simpleComposite.component.Component;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("这是一个叶子节点，添加失败");
    }

    @Override
    public void remove(Component component) {
        System.out.println("这是一个叶子节点，删除失败");
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth;i++) System.out.print("-");
        System.out.println("叶子节点："+this.getName());
    }
}

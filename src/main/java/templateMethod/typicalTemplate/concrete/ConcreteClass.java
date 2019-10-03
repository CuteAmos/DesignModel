package templateMethod.typicalTemplate.concrete;

import templateMethod.typicalTemplate.templateMethod.AbstractClass;

public class ConcreteClass extends AbstractClass {
    @Override
    protected void primitiveOperation1() {
        System.out.println("primitiveOperation1 执行了。。");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("primitiveOperation2 执行了。。");
    }
}

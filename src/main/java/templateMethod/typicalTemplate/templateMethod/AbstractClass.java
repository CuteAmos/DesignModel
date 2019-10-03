package templateMethod.typicalTemplate.templateMethod;

public abstract class AbstractClass {
    public void templateMethod(){
        System.out.println("templateMethod 模板方法：");
        System.out.println("primitiveOperation1 执行结果为：");
        primitiveOperation1();
        System.out.println("primitiveOperation2 执行结果为：");
        primitiveOperation2();
    }
    protected abstract void primitiveOperation1();
    protected abstract void primitiveOperation2();
}

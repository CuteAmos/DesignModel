package facade.simpleFacade.facade;

import facade.simpleFacade.subSystem.SubSystemFour;
import facade.simpleFacade.subSystem.SubSystemOne;
import facade.simpleFacade.subSystem.SubSystemThree;
import facade.simpleFacade.subSystem.SubSystemTwo;

public class Facade {
    private SubSystemOne one;
    private SubSystemTwo two;
    private SubSystemThree three;
    private SubSystemFour four;

    public Facade() {
        one = new SubSystemOne();
        two = new SubSystemTwo();
        three = new SubSystemThree();
        four = new SubSystemFour();
    }

    public void methodA() {
        System.out.println("方法组A执行：");
        one.MethodOne();
        two.MethodTwo();
        three.MethodThree();
    }

    public void methodB() {
        System.out.println("方法组B执行：");
        one.MethodOne();
        three.MethodThree();
        four.MethodFour();
    }
}

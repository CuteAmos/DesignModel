package test.prototype;

import org.junit.Test;
import prototype.deepCopy.prototype.DeepCopy;
import prototype.deepCopy.user.User;

public class DeepCopyTest {
    @Test
    public void testDeepCopy()  {
        DeepCopy deepCopy = new DeepCopy(new User("lisi",25),18,"test1");
        DeepCopy deepCopy2 = (DeepCopy)deepCopy.copy();
        System.out.println("未修改之前");
        System.out.println("deepCopy 为："+deepCopy);
        System.out.println("deepCopy2 为："+deepCopy2);
        deepCopy2.setId(10);
        deepCopy2.setStr("test2");
        deepCopy2.getUser().setName("zhansan");
        deepCopy2.getUser().setAge(10);
        System.out.println("修改之后");
        System.out.println("deepCopy 为："+deepCopy);
        System.out.println("deepCopy2 为："+deepCopy2);
    }
}

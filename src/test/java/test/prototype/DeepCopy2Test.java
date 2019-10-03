package test.prototype;

import org.junit.Test;
import prototype.deepCopy.prototype.DeepCopy2;
import prototype.deepCopy.serizalizable.SeriDeepCopy;
import prototype.deepCopy.user.User;

public class DeepCopy2Test {
    @Test
    public void testDeepCopy2(){
        DeepCopy2 deepCopy = new DeepCopy2(new User("lisi",25),18,"test1");
        DeepCopy2 deepCopy2 = SeriDeepCopy.copy(deepCopy);
        System.out.println("序列化深复制 未修改之前");
        System.out.println("deepCopy 为："+deepCopy);
        System.out.println("deepCopy2 为："+deepCopy2);
        deepCopy2.setId(40);
        deepCopy2.setStr("test3");
        deepCopy2.getUser().setName("xiaoming");
        deepCopy2.getUser().setAge(30);
        System.out.println("序列化深复制 修改之后");
        System.out.println("deepCopy 为："+deepCopy);
        System.out.println("deepCopy2 为："+deepCopy2);
    }
}

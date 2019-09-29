package test.prototype;

import org.junit.Test;
import prototype.shallowCopy.prototype.ShallowCopyPrototype;
import prototype.shallowCopy.user.User;

public class ShallowCopyTest {
    @Test
    public void testShallowCopy() throws CloneNotSupportedException{
        ShallowCopyPrototype shallowCopyPrototype1 = new ShallowCopyPrototype(new User("xiaoming", 25), 1, "test1");
        ShallowCopyPrototype shallowCopyPrototype2 = (ShallowCopyPrototype)shallowCopyPrototype1.clone();
        System.out.println("shallowCopyPrototype2 未修改之前: \nshallowCopyPrototype2 为 "+shallowCopyPrototype2.toString());
        System.out.println("shallowCopyPrototype1 为 " +shallowCopyPrototype1.toString());
        shallowCopyPrototype2.getUser().setName("lisi");
        shallowCopyPrototype2.getUser().setAge(18);
        shallowCopyPrototype2.setId(2);
        shallowCopyPrototype2.setStr("test2");
        System.out.println("shallowCopyPrototype2 修改之后:\nshallowCopyPrototype2"+shallowCopyPrototype2.toString());
        System.out.println("shallowCopyPrototype1 为 " +shallowCopyPrototype1.toString());
//        shallowCopyPrototype2 未修改之前:
//        shallowCopyPrototype2 为 ShallowCopyPrototype{user=User{name='xiaoming', age=25}, id=1, str='test1'}
//        shallowCopyPrototype1 为 ShallowCopyPrototype{user=User{name='xiaoming', age=25}, id=1, str='test1'}
//        shallowCopyPrototype2 修改之后:
//        shallowCopyPrototype2ShallowCopyPrototype{user=User{name='lisi', age=18}, id=2, str='test2'}
//        shallowCopyPrototype1 为 ShallowCopyPrototype{user=User{name='lisi', age=18}, id=1, str='test1'}
    }

}

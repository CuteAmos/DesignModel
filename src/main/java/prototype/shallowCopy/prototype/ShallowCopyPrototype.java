package prototype.shallowCopy.prototype;

import prototype.shallowCopy.user.User;

public class ShallowCopyPrototype implements Cloneable{
    private User user;
    private int id;
    private String str;

    @Override
    public String toString() {
        return "ShallowCopyPrototype{" +
                "user=" + user.toString() +
                ", id=" + id +
                ", str='" + str + '\'' +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public ShallowCopyPrototype(User user, int id, String str) {
        this.user = user;
        this.id = id;
        this.str = str;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

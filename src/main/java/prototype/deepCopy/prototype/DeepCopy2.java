package prototype.deepCopy.prototype;

import prototype.deepCopy.user.User;

import java.io.Serializable;

public class DeepCopy2 implements Serializable {
    private User user;
    private int id;
    private String str;

    public DeepCopy2(User user, int id, String str) {
        this.user = user;
        this.id = id;
        this.str = str;
    }

    public DeepCopy2() {
    }


    @Override
    public String toString() {
        return "DeepCopy{" +
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
}

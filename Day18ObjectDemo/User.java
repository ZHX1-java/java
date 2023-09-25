package Day18ObjectDemo;

import java.util.StringJoiner;
//Cloneable
//如果一个接口里面没有抽象方法
//表示当前的接口是一个标记性接口
//现在Cloneable表示一旦实现，那么当前类的对象就可以被克隆
//如果没有实现，当前类的独享就不能克隆
public class User implements Cloneable{

    private int id;//游戏角色
    private String userName;//用户名
    private String password;//密码
    private String path;//游戏图片
    private int[] data;//游戏进度

    public User() {
    }

    public User(int id, String userName, String password, String path, int[] data) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.path = path;
        this.data = data;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }


    public String toString() {
        return "角色编号 = " + id + ", 用户名 = " + userName + ", 密码 = " + password + ", 游戏图片 = " + path + ", 游戏进度 = " +  arrToString() ;
    }

    public String arrToString(){
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + ", ");
        }
        return sj.toString();
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类中的clone方法
        //相当于让Java帮我们克隆一个对象，并把克隆之后的对象返回去
        return super.clone();
    }
}

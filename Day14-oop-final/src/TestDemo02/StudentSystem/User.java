package TestDemo02.StudentSystem;

public class User {
    private String userName;
    private String password;
    private String personId;
    private String phone;

    public User() {
    }

    public User(String userName, String password, String personId, String phone) {
        this.userName = userName;
        this.password = password;
        this.personId = personId;
        this.phone = phone;
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

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

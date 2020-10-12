package cn.cdzy.emall.pojo;

/**
 * @ClassName : admin  //类名
 * @Description : 管理员  //描述
 * @Author : Program_Dog  //作者
 * @Date: 2020-10-12 09:45  //时间
 */
public class Admin {
    private Integer id;
    private String username;
    private String password;

    public Admin(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Admin() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "admin{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

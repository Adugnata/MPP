package lesson6.lap6app;

public class User {
    public String username;
    public String password;
    public Auth authorization;

    public User(String username, String pwd, Auth auth) {
        this.username = username;
        this.password = pwd;
        this.authorization = auth;
    }

    public boolean equals(Object ob) {
        if (ob == null) {
            return false;
        } else if (!(ob instanceof User)) {
            return false;
        } else {
            User u = (User) ob;
            return this.username.equals(u.username) && this.password.equals(u.password);
        }
    }
}

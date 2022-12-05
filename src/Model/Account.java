package Model;

public class Account {
    private String username;
    private String password;
    private boolean isadmin;

    public Account() {
    }

    public Account(String username, String password, boolean isadmin) {
        this.username = username;
        this.password = password;
        this.isadmin = isadmin;
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

    public boolean isIsadmin() {
        return isadmin;
    }

    public void setIsadmin(boolean isadmin) {
        this.isadmin = isadmin;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isadmin=" + isadmin +
                '}';
    }
}

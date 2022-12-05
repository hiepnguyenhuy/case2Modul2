package Manager;

import Model.User;
import io.ReadAndWrite;

import java.util.ArrayList;

public class ManagerUser {
    static ArrayList<User> users = new ArrayList<>();
    ReadAndWrite rawUser = new ReadAndWrite();
   public static User user;


    {
        users = rawUser.read("User.txt");
    }

    public boolean loginAdmin(String userName, String passWord) {
        if (userName.equals("admin") && passWord.equals("admin")) {
            return true;
        }
        return false;
    }

    public boolean loginUser(String userName, String passWord) {
        for (User us : users) {
            if (us.getUserName().equals(userName) && us.getPassWord().equals(passWord)) {
                ManagerUser.user = us;
                return true;
            }
        }
        return false;
    }

    public void registerUser(User user) {

        ManagerUser.users.add(user);
        rawUser.write(users, "User.txt");
    }
public ArrayList<User> findAll() {
    return users;
}
    public int findUserName(String UserName) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(UserName)) {
                return i;
            }
        }
        return -1;
    }

    public void deleteUser(int index) {
        users.remove(index);
        rawUser.write(users, "User.txt");
    }

    public void editUser(int index, User user) {
        users.set(index, user);
    }

}

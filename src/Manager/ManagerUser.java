package Manager;

import Model.User;
import io.ReadAndWrite;

import javax.sound.midi.MidiFileFormat;
import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;

public class ManagerUser {
    static ArrayList<User> users = new ArrayList<>();
    ReadAndWrite<User> rawUser = new ReadAndWrite();
    public static User user;


    {

        users = rawUser.read("User.txt");
    }

    public boolean loginAdmin(String userName, String passWord) {
        if (userName.equals("adminadmin") && passWord.equals("admin123")) {
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



    public void editName(String oldfullName, String newfullname) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getFullName().equals(oldfullName)) {
                users.get(i).setFullName(newfullname);
            }
        }

        rawUser.write(users, "User.txt");
    }
    public void editpass(String oldpass, String newpass) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getPassWord().equals(oldpass)) {
                users.get(i).setPassWord(newpass);
            }
        }

        rawUser.write(users, "User.txt");
    }
    public void editusername(String oldusername, String newusername) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserName().equals(oldusername)) {
                users.get(i).setUserName(newusername);
            }
        }
        rawUser.write(users, "User.txt");
    }
    public void editPhone(int oldphone, int newphone) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getPhoneNumber()==oldphone) {
                users.get(i).setPhoneNumber(newphone);
            }
        }
        rawUser.write(users, "User.txt");
    }

    public void editAddress(String oldaddress, String newaddress) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getAddress().equals(oldaddress)) {
                users.get(i).setAddress(newaddress);
            }
        }
        rawUser.write(users, "User.txt");
    }
}

//package Manager;
//
//import Model.Account;
//import Model.User;
//import io.ReadAndWrite;
//
//import java.util.ArrayList;
//
//public class ManagerAccount {
//    static ArrayList<Account> accounts = new ArrayList<>();
//    static Account account;
//    public static User user2;
//
//    ReadAndWrite<Account> rawAcc = new ReadAndWrite();
//    ReadAndWrite<User> raw = new ReadAndWrite();
//
//    {
//        accounts = rawAcc.read("Account.txt");
//        if (accounts.size() == 0) {
//            accounts.add(new Account("admin", "admin", true));
//        }
//        ManagerUser.users = raw.read("User.txt");
//    }
//
//
//
//
//    public void addAccountUser(User user) {
//        accounts.add(user);
//        ManagerUser.users.add(user);
//        raw.write(ManagerUser.users, "User.txt");
//        rawAcc.write(accounts, "Account.txt");
//    }
//
//    public boolean Login(String UserName, String PassWord) {
//        for (Account acc : accounts) {
//            if (acc.getUsername().equals(UserName)
//                    && acc.getPassword().equals(PassWord)) {
//                account = acc;
//                if (!acc.isIsadmin()) {
//                    ManagerUser.user = (User) acc;
//                }
//
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public int checkrole() {
//        if (ManagerUser.user.isIsadmin()) {
//            return 1;
//        }
//        return -1;
//    }
//
//}

//package Manager;
//
//import Model.Account;
//import Model.User;
//
//import java.util.ArrayList;
//
//public class ManagerAccount {
//    static ArrayList<Account> accounts = new ArrayList<>();
//    static Account account;
//    {
//        if (accounts.size() == 0) {
//            accounts.add(new Account("admin", "admin", true));
//        }
//    }
//
//
//
//
//    public void addAccountUser(User user) {
//        accounts.add(user);
//        ManagerUser.users.add(user);
//    }
//
//    public boolean Login(String UserName, String PassWord) {
//        for (Account acc : accounts) {
//            if (acc.getUsername().equals(UserName)
//                    && acc.getPassword().equals(PassWord)) {
//                ManagerAccount.account = acc;
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public int checkrole() {
//        if (account.isIsadmin()) {
//            return 1;
//        }
//        return -1;
//    }
//
//}

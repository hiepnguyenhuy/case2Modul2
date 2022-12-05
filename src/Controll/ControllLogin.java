package Controll;

import Manager.ManagerUser;
import View.ViewLogin;

public class ControllLogin {
    public static void menuLogin() {
        ViewLogin viewLogin = new ViewLogin();
        ManagerUser managerUser = new ManagerUser();
        while (true) {
            int choice = viewLogin.menuLogin();
            switch (choice) {
                case 1:
                    if (managerUser.loginAdmin(viewLogin.userName(), viewLogin.passWord())) {
                        ControllAdmin.menuAdmin();
                    }
                    break;
                case 2:
                    if (managerUser.loginUser(viewLogin.userName(), viewLogin.passWord())) {
                        ControllUser.menuUser();
                    }
                    break;
                case 3:
                    managerUser.registerUser(viewLogin.creatUser());
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }

}

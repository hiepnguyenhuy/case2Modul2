package View;

import Model.User;

import java.util.Scanner;

public class ViewLogin {
    Scanner sc = new Scanner(System.in);

    public int menuLogin() {
        System.out.println("1. Đăng nhập tài khoản Admin");
        System.out.println("2. Đăng nhập tài khoản User");
        System.out.println("3. Đăng ký tài khoản User");
        System.out.println("4. Thoát khỏi chương trình");
        return Integer.parseInt(sc.nextLine());
    }

    public User creatUser() {
        System.out.println("Nhập vào tên đăng nhập");
        String userName, regexUser = "[a-zA-Z]{6,20}";
        while (true) {
            userName = sc.nextLine();
            if (userName.matches(regexUser)) {
                break;
            }
            System.out.println("Phải từ 6 kí tự");
        }

        System.out.println("Nhập vào mật khẩu đăng nhập");
        String pass, regexPass = "[a-z1-9]{6,20}";
        while (true) {
            pass = sc.nextLine();
            if (pass.matches(regexPass)) {
                break;
            } else {
                System.out.println("Nhập sai");
            }
        }

        System.out.println("Nhập vào họ và tên");
        String fullName;
        while (true) {
            try {
                fullName = sc.nextLine();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Phải nhập chữ");
            }
        }

        System.out.println("Nhập vào số điện thoại");
        int phoneNumber;
        while (true) {
            try {
                phoneNumber = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Phải nhập số");
            }
        }

        System.out.println("Nhập vào địa chỉ");
        String address = sc.nextLine();

        return new User(userName, pass, fullName, phoneNumber, address);

    }


    public String userName() {
        System.out.println("Nhập vào tên đăng nhập");
        String user, regexUser = "[a-zA-Z]{6,20}";
        while (true) {
            user = sc.nextLine();
            if (user.matches(regexUser)) {
                break;
            }
            System.out.println("Phải từ 6 kí tự");
        }
        return user;
    }


    public String passWord() {
        System.out.println("Nhập vào mật khẩu đăng nhập");
        String pass, regexPass = "[a-z1-9]{6,20}";
        while (true) {
            pass = sc.nextLine();
            if (pass.matches(regexPass)) {
                break;
            } else {
                System.out.println("Nhập sai");
            }
        }
        return pass;
    }

}

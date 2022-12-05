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
        String userName = sc.nextLine();
        System.out.println("Nhập vào mật khẩu đăng nhập");
        String pass = sc.nextLine();
        System.out.println("Nhập vào họ và tên");
        String fullName = sc.nextLine();
        System.out.println("Nhập vào số điện thoại");
        int phoneNumber = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào địa chỉ");
        String address = sc.nextLine();

        return new User(userName, pass, fullName, phoneNumber, address);

    }



public String userName() {
    System.out.println("Nhập vào tên đăng nhập");
    return sc.nextLine();

}
    public String passWord() {
        System.out.println("Nhập vào mật khẩu");
        return sc.nextLine();

    }

}

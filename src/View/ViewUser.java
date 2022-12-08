package View;

import Model.Product;
import Model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewUser {
    static Scanner sc = new Scanner(System.in);

    public int menuUser() {
        System.out.println("1. Mua hàng");
        System.out.println("2. Quản lý tài khoản");
        System.out.println("3. Đăng xuất");
        int input;
        while (true) {
            try {
                input = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Phải nhập số");
            }
        }
        return input;
    }

    public int menuPurchase() {
        System.out.println("1. Tìm kiếm");
        System.out.println("2. Tìm sản phẩm theo giá khoảng giá");
        System.out.println("3. Sắp xếp sản phẩm theo giá");
        System.out.println("4. Mua hàng");
        System.out.println("5. Sửa đơn hàng");
        System.out.println("6. Xem hóa đơn");
        System.out.println("7. Quay lại");
        int input;
        while (true) {
            try {
                input = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Phải nhập số");
            }
        }
        return input;


    }

    public int menuMNAccount() {
        System.out.println("1. Sửa tên đăng nhập ");
        System.out.println("2. Sửa mật khẩu");
        System.out.println("3. Sửa tên");
        System.out.println("4. Sửa số điện thoại");
        System.out.println("5. Sửa địa chỉ");
        System.out.println("6. Quay lại");
        int input;
        while (true) {
            try {
                input = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Phải nhập số");
            }
        }
        return input;

    }

    public int inputAmount() {
        System.out.println("Nhập số lượng sản phẩm muốn mua");
        int input;
        while (true) {
            try {
                input = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Phải nhập số");
            }
        }
        return input;

    }

    public String inputProductName() {
        System.out.println("Nhập vào tên sản phẩm");
        String input1;
        while (true) {
            try {
                input1 = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Phải nhập chữ");
            }
        }
        return input1;

    }

    public void inputPriceRage() {
        System.out.println("Nhập vào khoảng giá bạn muốn tìm");
    }

    public int inputLowPrice() {
        System.out.println("Nhập vào giá thấp nhất");
        int input;
        while (true) {
            try {
                input = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Phải nhập số");
            }
        }
        return input;

    }

    public int inputHighPrice() {
        System.out.println("Nhập vào giá thấp nhất");
        int input;
        while (true) {
            try {
                input = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Phải nhập số");
            }
        }
        return input;
    }

    public void Message() {
        System.out.println("Sản phẩm bạn chọn đã có trong giỏ hàng");
    }

    public void inHoadon(double db) {
        System.out.println("Tổng số tiền cần thanh toán: " + db);
    }


    public String oldfullname() {
        System.out.println("Nhập vào họ và tên cũ");
        return sc.nextLine();
    }

    public String newfullname() {
        System.out.println("Nhập vào họ và tên mới");
        return sc.nextLine();
    }

    public String newUsername() {
        System.out.println("Nhập vào tên đăng nhập mới");
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

    public String oldUsername() {
        System.out.println("Nhập vào tên đăng nhập cũ");
        return sc.nextLine();
    }

    public String oldpass() {
        System.out.println("Nhập vào mật khẩu cũ");
        return sc.nextLine();
    }

    public String newpass() {
        System.out.println("Nhập vào mật khẩu đăng nhập mới");
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

    public int oldPhone() {
        System.out.println("Nhập vào số điện thoại cũ");
        return Integer.parseInt(sc.nextLine());
    }

    public int newphone() {
        System.out.println("Nhập vào số điện thoại mới");
        int phoneNumber;
        while (true) {
            try {
                phoneNumber = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Phải nhập số");
            }
        }
        return phoneNumber;
    }

    public String newaddress() {
        System.out.println("Nhập vào địa chỉ mới");
        return sc.nextLine();
    }

    public String oldaddress() {
        System.out.println("Nhập vào địa chỉ cũ");
        return sc.nextLine();
    }

    public void showfind(ArrayList<Product> list) {
        for (Product pr :
                list) {
            System.out.println(pr.toString());
        }
    }
public void showproduc(ArrayList<Product> prs) {
    for (Product pr: prs) {
        System.out.println(pr.toString());
    }
}

}

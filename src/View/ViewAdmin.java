package View;


import Manager.ManagerUser;
import Model.Account;

import Model.Product;
import Model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ViewAdmin {
    Scanner sc = new Scanner(System.in);

    public int menuAdmin() {
        System.out.println("DANH MỤC QUẢN LÝ");
        System.out.println("1. Quản lý User");
        System.out.println("2. Quản lý Sản Phẩm");
        System.out.println("3. Quản lý Đơn hàng");
        System.out.println("4. Quay lại");
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

    public int managerUser() {
        System.out.println("1. Xem danh sách User ");
        System.out.println("2. Xóa User");
        System.out.println("3. Quay lại");
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

    public int managerProduct() {
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Sửa thông tin sản phẩm");
        System.out.println("3. Xóa sản phẩm");
        System.out.println("4. Hiển thị danh sách sản phẩm");
        System.out.println("5. Quay lại");

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

    public int menuItem() {
        System.out.println("1. Xem toàn bộ ");
        System.out.println("2. Quay lại");
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

    public void showUser(ArrayList<User> us) {
        for (User u : us) {
            System.out.println(u.toString());
        }
    }


    public String inputUserName() {
        System.out.println("Nhập vào tên đăng nhập");
        return sc.nextLine();
    }

    public String inputPassWord() {
        System.out.println("Nhập vào mật khẩu");
        return sc.nextLine();
    }

    public Product creatProduct() {
        System.out.println("Nhập vào tên sản phẩm");
        String producsName;
        while (true) {
            try {
                producsName = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Phải nhập chữ");
            }
        }
        System.out.println("Nhập vào giá sản phẩm");
        double producPrice;
        while (true) {
            try {
                producPrice = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Phải nhập số");
            }
        }
        System.out.println("Nhập vào số lượng sản phẩm");
        int amount = Integer.parseInt(sc.nextLine());
        while (true) {
            try {
                amount = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Phải nhập số");
            }
        }
        return new Product(producsName, producPrice, amount);
    }

    public void showProduct(ArrayList<Product> products) {
        for (Product pr : products) {
            System.out.println(pr.toString());
        }
    }

    public String inputProductsName() {
        System.out.println(" Nhập vào tên sản phẩm ");
        return sc.nextLine();
    }

    public void showTonkho(int soluong) {
        System.out.println("Sản phẩm có số lượng tồn kho là " + soluong);
    }


}

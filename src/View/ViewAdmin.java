package View;

//import Manager.ManagerAccount;
import Manager.ManagerUser;
import Model.Account;
import Model.Product;
import Model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewAdmin {
    Scanner sc = new Scanner(System.in);

    public int   menuAdmin() {
        System.out.println("DANH MỤC QUẢN LÝ");
        System.out.println("1. QUẢN LÝ USER");
        System.out.println("2. QUẢN LÝ SẢN PHẨM");
        System.out.println("3. QUẢN LÝ GIỎ HÀNG");
        System.out.println("4. ĐĂNG XUẤT");
        return Integer.parseInt(sc.nextLine());
    }

public int managerUser() {
    System.out.println("1. XEM DANH SÁCH USER ");
    System.out.println("2. SỬA THÔNG TIN KHÁCH HÀNG");
    System.out.println("3. XÓA USER THEO TÊN");
    return Integer.parseInt(sc.nextLine());
}

public int managerProduct() {
    System.out.println("1. Thêm sản phẩm");
    System.out.println("2. Sửa thông tin sản phẩm");
    System.out.println("3. Xóa sản phẩm");
    System.out.println("4. Tìm kiếm sản phẩm theo tên");
    System.out.println("5. Hiển thị danh sách sản phẩm");

    return Integer.parseInt(sc.nextLine());
}
public void showUser(ArrayList<User> us) {
    for (User u: us) {
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
        String producsName = sc.nextLine();
        System.out.println("Nhập vào giá sản phẩm");
        double producPrice = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào số lượng sản phẩm");
        int amount = Integer.parseInt(sc.nextLine());
        return new Product(producsName,producPrice,amount);
    }

    public void showProduct(ArrayList<Product> products) {
        for (Product pr: products) {
            System.out.println(pr.toString());
        }
    }
    public String inputProductsName() {
        System.out.println(" Nhập vào tên sản phẩm ");
        return sc.nextLine();
    }

    public void showTonkho(int soluong) {
        System.out.println("Sản phẩm có số lượng tồn kho là " + soluong );
    }




















}

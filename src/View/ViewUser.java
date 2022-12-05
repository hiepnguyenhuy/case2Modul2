package View;

import Model.User;

import java.util.Scanner;

public class ViewUser {
    static Scanner sc = new Scanner(System.in);

    public int menuUser() {
        System.out.println("1. Lọc sản phẩm theo giá");
        System.out.println("2. Sắp xếp sản phẩm theo giá");
        System.out.println("3. Xem sản phẩm bán chạy");
        System.out.println("4. Lựa chọn sản phẩm");
        System.out.println("5. Xem sản phẩm đã chọn");
        System.out.println("6. Sửa giỏ hàng");
        System.out.println("7. Xem tổng đơn hàng");
        System.out.println("8. Đăng xuất");
        return Integer.parseInt(sc.nextLine());
    }

    public int inputAmount() {
        System.out.println(" Nhập số lượng sản phẩm muốn mua");
        return Integer.parseInt(sc.nextLine());
    }

    public String inputProductName() {
        System.out.println("Nhập vào tên sản phẩm");
        return sc.nextLine();
    }

    public void inputPriceRage() {
        System.out.println("Nhập vào khoảng giá bạn muốn tìm");
    }

    public int inputLowPrice() {
        System.out.println("Nhập vào giá thấp nhất");
        return Integer.parseInt(sc.nextLine());
    }

    public int inputHighPrice() {
        System.out.println("Nhập vào giá thấp nhất");
        return Integer.parseInt(sc.nextLine());
    }

    public String Message() {
        System.out.println("Sản phẩm bạn chọn đã có trong giỏ hàng,thay đổi ở số lượng ở đây");
        return sc.nextLine();
    }

    public void inHoadon(double db) {
        System.out.println(db);
    }



}

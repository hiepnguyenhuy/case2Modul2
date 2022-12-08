package Controll;


import Manager.ManagerItem;
import Manager.ManagerProduct;
import Manager.ManagerUser;

import View.ViewAdmin;
import View.ViewLogin;

import java.util.ArrayList;

public class ControllAdmin {
    public static void menuAdmin() {
        ManagerUser managerUser = new ManagerUser();
        ManagerProduct managerProduct = new ManagerProduct();
        ViewAdmin viewAdmin = new ViewAdmin();
        ViewLogin viewLogin = new ViewLogin();
        ManagerItem it = new ManagerItem();
        try {
            while (true) {
                int choice = viewAdmin.menuAdmin();
                switch (choice) {
                    case 1: //Quản lý user
                        int choice2;
                        do {
                            choice2 = viewAdmin.managerUser();
                            switch (choice2) {
                                case 1: // xem user
                                    viewAdmin.showUser(managerUser.findAll());
                                    break;

                                case 2: // xóa user
                                    int indexdelete = managerUser.findUserName(viewAdmin.inputUserName());
                                    if (indexdelete != -1) {
                                        managerUser.deleteUser(indexdelete);
                                    }
                                    break;
                                case 3:
                                    break;
                            }
                        } while (choice2 != 3);
                        break;

                    case 2: //Quản lý sản phẩm

                        int choice3;
                        do {
                            choice3 = viewAdmin.managerProduct();

                            switch (choice3) {

                                case 1: // thêm sản phẩm
                                    managerProduct.addProduct(viewAdmin.creatProduct());
                                    break;
                                case 2: // sửa thông tin sản phẩm
                                    int indexProductEdit = managerProduct.findProduct(viewAdmin.inputProductsName());
                                    managerProduct.editProduct(indexProductEdit, viewAdmin.creatProduct());
                                    break;
                                case 3: // xóa sản phẩm
                                    int indexProductDelete = managerProduct.findProduct(viewAdmin.inputProductsName());
                                    managerProduct.deleteProduct(indexProductDelete);
                                    break;
                                case 4: // hiển thị danh sách sản phẩm
                                    viewAdmin.showProduct(managerProduct.showProducts());
                                    break;
                                case 5:
                                    break;
                            }
                        } while (choice3 != 5);

                        break;

                    case 3: // Quản lý giỏ hàng
                        int choice6 = viewAdmin.menuItem();
                        switch (choice6) {
                            case 1:
                                it.showAll();
                                break;

                            case 2:
                                return;
                        }

                        break;
                    case 4:// Đăng xuất
                        return;
                }
            }
        } catch (NumberFormatException e) {

        }
    }
}

package Controll;

import Manager.ManagerItem;
import Manager.ManagerProduct;
import Manager.ManagerUser;
import View.ViewAdmin;
import View.ViewLogin;

public class ControllAdmin {
    public static void menuAdmin() {
        ManagerUser managerUser = new ManagerUser();
        ManagerProduct managerProduct = new ManagerProduct();
        ViewAdmin viewAdmin = new ViewAdmin();
        ViewLogin viewLogin = new ViewLogin();
        ManagerItem it = new ManagerItem();
        while (true) {
            int choice = viewAdmin.menuAdmin();
            switch (choice) {
                case 1: //Quản lý user
                    int choice2 = viewAdmin.managerUser();

                    switch (choice2) {
                        case 1:
                            viewAdmin.showUser(managerUser.findAll());
                            break;
                        case 2:
                            int index = managerUser.findUserName(viewAdmin.inputUserName());
                            if (index != -1) {
                                managerUser.editUser(index, viewLogin.creatUser());
                            }

                            break;
                        case 3:
                            int indexdelete = managerUser.findUserName(viewAdmin.inputUserName());
                            if (indexdelete != -1) {
                                managerUser.deleteUser(indexdelete);
                            }
                            break;
                    }
                    break;
                case 2: //Quản lý sản phẩm
                    int choice3 = viewAdmin.managerProduct();

                    switch (choice3) {

                        case 1:
                            managerProduct.addProduct(viewAdmin.creatProduct());
                            break;
                        case 2:
                            int indexProductEdit = managerProduct.findProduct(viewAdmin.inputProductsName());
                            managerProduct.editProduct(indexProductEdit, viewAdmin.creatProduct());
                            break;
                        case 3:
                            int indexProductDelete = managerProduct.findProduct(viewAdmin.inputProductsName());
                            managerProduct.deleteProduct(indexProductDelete);
                            break;
                        case 4:
                            managerProduct.findProduct(viewAdmin.inputProductsName());
                            break;
                        case 5:
                            managerProduct.showProducts();
                            break;

                    }
                    break;
                case 3: // Quản lý giỏ hàng
                    it.showItems();
                    managerProduct.tonKho(viewAdmin.inputProductsName());
                    break;
                case 4:// Đăng xuất
                    return;
            }
        }
    }
}

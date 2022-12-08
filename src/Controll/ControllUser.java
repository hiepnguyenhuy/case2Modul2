package Controll;


import Manager.ManagerItem;
import Manager.ManagerProduct;
import Manager.ManagerUser;

import Model.Item;


import View.ViewUser;



public class ControllUser {
//    public static Item item;

    public static void menuUser() {
        ViewUser viewUser = new ViewUser();
        ManagerItem managerItem = new ManagerItem();
        ManagerProduct managerProduct = new ManagerProduct();

        Item item;
        ManagerUser managerUser = new ManagerUser();
        try {


            while (true) {
                int choice1 = viewUser.menuUser();
                switch (choice1) {
                    case 1: // mua hàng
                        int choice2;
                        do {
                            choice2 = viewUser.menuPurchase();

                            switch (choice2) {
                                case 1:// tìm kiếm
                                    viewUser.showfind(managerProduct.find(viewUser.inputProductName()));
                                    break;
                                case 2: // lọc sản phẩm theo khoảng giá
                                    viewUser.inputPriceRage();
                                    managerProduct.findByPrice(viewUser.inputLowPrice(), viewUser.inputHighPrice());
                                    break;
                                case 3: // sắp xếp sản phẩm theo giá
                                    managerProduct.showProductsByPrice();
                                    break;
                                case 4: // mua hàng
                                    viewUser.showproduc(managerProduct.showProducts());
                                    String prdName = viewUser.inputProductName();
                                    if (managerItem.checkItem(prdName) == -1) {
                                        int amount;
                                        do {
                                            amount = viewUser.inputAmount();
                                            item = new Item(ManagerUser.user,
                                                    managerProduct.returnProduct(prdName),
                                                    amount);
                                        } while (amount > managerProduct.returnProduct(prdName).getAmount());
                                        managerItem.purchace(item);
                                        managerItem.tonKho(prdName,ManagerUser.user.getUserName());

                                    } else {
                                        viewUser.Message();
                                        break;
                                    }
                                    break;
                                case 5: // sửa đơn hàng
//                                    int choice6 = viewUser.suaHang();
                                    String prdSua = viewUser.inputProductName();
//                                    switch (choice6) {
//                                        case 1:
//                                            int amountedit;
//                                            amountedit = viewUser.inputAmount();
//                                            managerItem.editAmount(prdSua, amountedit);
//                                            break;
//                                        case 2:
                                            managerItem.deleteItem(prdSua);
//                                            break;
//                                        case 3:
//                                            return;
//                                    }
                                    break;
                                case 6:// xem hóa đơn
                                    managerItem.show();
                                    viewUser.inHoadon(managerItem.tongDonhangtam());
                                    break;
                                case 7:
                                    break;
                            }
                        } while (choice2 != 7);
                        break;
                    case 2: // quản lý tài khoản
                        int choice3;
                        do {
                            choice3 = viewUser.menuMNAccount();
                            switch (choice3) {
                                case 1:
                                    managerUser.editusername(viewUser.oldUsername(), viewUser.newUsername());
                                    break;
                                case 2:
                                    managerUser.editpass(viewUser.oldpass(), viewUser.newpass());
                                    break;
                                case 3:
                                    managerUser.editName(viewUser.oldfullname(), viewUser.newfullname());
                                    break;
                                case 4:
                                    managerUser.editPhone(viewUser.oldPhone(), viewUser.newphone());
                                    break;
                                case 5:
                                    managerUser.editAddress(viewUser.oldaddress(), viewUser.newaddress());
                                    break;
                                case 6:
                                    break;
                            }
                        } while (choice3 != 6);
                        break;
                    case 3: // đăng xuất
                        return;
                }
            }
        } catch (NumberFormatException e) {
        }

    }
}

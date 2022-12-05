package Controll;

import Manager.ManagerItem;
import Manager.ManagerProduct;
import Manager.ManagerUser;
import Model.Item;
import View.ViewUser;

public class ControllUser {
    public static Item item;

    public static void menuUser() {
        ViewUser viewUser = new ViewUser();
        ManagerItem managerItem = new ManagerItem();
        ManagerProduct managerProduct = new ManagerProduct();


        while (true) {
            int choice4 = viewUser.menuUser();
            switch (choice4) {
                case 1:
                    viewUser.inputPriceRage();
                    managerProduct.findByPrice(viewUser.inputLowPrice(), viewUser.inputHighPrice());
                    break;
                case 2:
                    managerProduct.showProductsByPrice();
                    break;
                case 3:
                    break;
                case 4:


                    managerProduct.showProducts();
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

                    } else {
                        viewUser.Message();
                        int amountedit = viewUser.inputAmount();
                        managerItem.editAmount(prdName, amountedit);

                    }

                    break;
                case 5:
                    managerItem.show();
                    break;
                case 6:
                    managerItem.editItem(viewUser.inputProductName());
                    break;
                case 7:
                    viewUser.inHoadon(managerItem.tongDonhang());
                    break;
                case 8:
                    return;
            }
        }
    }


}

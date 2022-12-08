package Manager;

import Controll.ControllUser;
import Model.Item;
import Model.Product;
import Model.User;
import io.ReadAndWrite;

import java.util.ArrayList;

public class ManagerItem {

    static ArrayList<Item> items = new ArrayList<>();
    ManagerProduct managerProduct = new ManagerProduct();

    ReadAndWrite<Item> rawItem = new ReadAndWrite<>();
    ReadAndWrite<Product> rawProduct = new ReadAndWrite<>();


    {
        items = rawItem.read("Item.txt");
        ManagerProduct.products = rawProduct.read("Products.txt");
    }

    public void purchace(Item item) {
        items.add(item);
        rawItem.write(items, "Item.txt");
    }


    public void show() {
        for (Item it : items) {
            if (it.getUser().getUserName().equals(ManagerUser.user.getUserName())) {
                System.out.println(it.item());
            }
        }
    }
    public void showAll() {
        for (Item it :
             items) {
            System.out.println(it.bills());
        }
    }


    public void findIndexByName(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getUser().getUserName().equals(item.getUser().getUserName())) {
                items.remove(items.get(i));
            }
        }

    }

    public double tongDonhangtam() {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getUser().getUserName().equals(ManagerUser.user.getUserName())) {
                total += items.get(i).tongTien();
            }
        }
        return total;

    }


    public int checkItem(String productName) {

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getUser().getUserName().equals(ManagerUser.user.getUserName()) &&
                    items.get(i).getProduct().getProducsName().equals(productName)) {

                items.get(i).getNumberOfSelected();
                return i;
            }
        }

        return -1;
    }

    public void editAmount(String productName, int amount) {

        int index = checkItem(productName);
        if (index != -1) {
            items.get(index).setNumberOfSelected(amount);


        }
        rawItem.write(items, "Item.txt");
    }


    public void deleteItem(String productName) {
        int index = checkItem(productName);
        if (index != -1) {

            for (int i = 0; i < ManagerProduct.products.size(); i++) {
                if (ManagerProduct.products.get(i).getProducsName().
                        equals(items.get(index).getProduct().getProducsName())) {
                    ManagerProduct.products.get(i).setAmount(ManagerProduct.products.get(i).getAmount() +
                            items.get(index).getNumberOfSelected());
                }
            }
            items.remove(index);
        }
        rawItem.write(items, "Item.txt");
        rawProduct.write(ManagerProduct.products, "Products.txt");
    }


    public int tonKho(String prdName, String UserName) {
        int tonKho = 0;
        int dem = 0;

        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getProduct().getProducsName().equals(prdName) &&
            items.get(i).getUser().getUserName().equals(UserName))
                dem += items.get(i).getNumberOfSelected();
        }
        tonKho = managerProduct.returnProduct(prdName).getAmount() - dem;

        managerProduct.returnProduct(prdName).setAmount(tonKho);
        rawProduct.write(ManagerProduct.products, "Products.txt");
        return tonKho;
    }

    public int timVitrisp(Item item) {
        for (int i = 0; i < ManagerProduct.products.size(); i++) {
            if (item.getProduct().getProducsName().
                    equals(ManagerProduct.products.get(i).getProducsName())) {
                return i;
            }
        }
        return -1;
    }


}

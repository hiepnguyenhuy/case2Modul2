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
                System.out.println(it.coTien());
            }
        }
    }


    public double tongDonhang() {
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
        rawItem.write(items,"Item.txt");

    }




    public void editItem(String productName) {
        int index = checkItem(productName);
        if (index != -1) {
            items.remove(index);
        }
        rawItem.write(items,"Item.txt");
    }




    public void showItems() {
        for (Item itt: items) {
            System.out.println(itt.toString());
        }
    }




}

package Manager;

import Model.Product;
import io.ReadAndWrite;

import java.lang.reflect.Parameter;
import java.util.ArrayList;

public class ManagerProduct {
    static ArrayList<Product> products = new ArrayList<>();
    ReadAndWrite<Product> rawProduct = new ReadAndWrite<>();

    {
        products = rawProduct.read("Products.txt");
    }

    public void showProducts() {
        for (Product pr : products) {
            System.out.println(pr.toString());
        }
    }

    public int findProduct(String productName) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProducsName().equals(productName)) {
                return i;
            }
        }
        return -1;
    }

    public Product returnProduct(String productName) {
        for (Product pr : products) {
            if (pr.getProducsName().equals(productName)) {
                return pr;
            }
        }
        return null;
    }


    public void addProduct(Product product) {
        products.add(product);
        rawProduct.write(products, "Products.txt");
    }

    public void editProduct(int index, Product product) {
        products.set(index, product);
        rawProduct.write(products, "Products.txt");
    }

    public void deleteProduct(int index) {
        products.remove(index);

    }

    public void sortByPrice() {
        products.sort(Product::compareTo);
    }

    public void showProductsByPrice() {
        this.sortByPrice();
        for (Product prd : products) {
            System.out.println(prd.toString());
        }
    }

    public void findByPrice(int price1, int price2) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProducPrice() >= price1
                    && products.get(i).getProducPrice() <= price2) {
                System.out.println(products.get(i));
            }
        }
    }

    public void tonKho(String prdName) {
        int count = 0;
        for (int i = 0; i < ManagerItem.items.size(); i++) {
            if (ManagerItem.items.get(i).getProduct().getProducsName().equals(prdName)) {
                count = products.get(i).getAmount() - ManagerItem.items.get(i).getNumberOfSelected();
                products.get(i).setAmount(count);
            }
        }
        System.out.println(count);

    }


}

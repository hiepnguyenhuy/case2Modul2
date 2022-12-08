package Manager;

import Model.Product;
import io.ReadAndWrite;


import java.util.ArrayList;


public class ManagerProduct {
    static ArrayList<Product> products = new ArrayList<>();
    static ReadAndWrite<Product> rawProduct = new ReadAndWrite<>();

    {
        products = rawProduct.read("Products.txt");
    }

    public ArrayList<Product> showProducts() {
        return products;
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
        rawProduct.write(products, "Products.txt");
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

    public ArrayList<Product> find(String name) {
        ArrayList<Product> list = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProducsName().toLowerCase().contains(name.toLowerCase())) {
                list.add(products.get(i));
            }
        }
        return list;
    }



}

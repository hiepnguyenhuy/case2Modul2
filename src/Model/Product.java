package Model;

import java.io.Serializable;

public class Product implements Serializable, Comparable<Product> {
    private String producsName;
    private double producPrice;
    private int amount;

    public Product() {
    }

    public Product(String producsName, double producPrice, int amount) {
        this.producsName = producsName;
        this.producPrice = producPrice;
        this.amount = amount;
    }

    public String getProducsName() {
        return producsName;
    }

    public void setProducsName(String producsName) {
        this.producsName = producsName;
    }

    public double getProducPrice() {
        return producPrice;
    }

    public void setProducPrice(double producPrice) {
        this.producPrice = producPrice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Sản phẩm{" +
                "Tên sản phẩm='" + producsName + '\'' +
                ", Giá sản phẩm=" + producPrice +
                ", số lượng hiện có =" + amount +
                '}';
    }

    public String thongtindonhang() {
        return
                "Sản phẩm:" + producsName + '\'' +
                ", Giá " + producPrice
                ;
    }

    @Override
    public int compareTo(Product product) {
        if (this.producPrice > product.producPrice) {
            return 1;
        } else if (this.producPrice < product.producPrice) {
            return -1;
        }
        else {
            return 0;
        }
    }



}

package Model;

import java.io.Serializable;

public class Item implements Serializable  {

    private User user;
    private Product product;
    private int numberOfSelected;


    public Item() {
    }

    public Item(User user, Product product, int numberOfSelected) {
        this.user = user;
        this.product = product;
        this.numberOfSelected = numberOfSelected;

    }



    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getNumberOfSelected() {
        return numberOfSelected;
    }

    public void setNumberOfSelected(int numberOfSelected) {
        this.numberOfSelected = numberOfSelected;
    }

    public double tongTien() {
        return this.getProduct().getProducPrice() * this.numberOfSelected;
    }

    @Override
    public String toString() {
        return "Quý khách" +
                  user.showThongtinmuahang() +
                ", Đã chọn =" + product.thongtindonhang() +
                ", Số lượng sản phẩm=" + numberOfSelected ;
    }


    public String coTien() {
        return "Quý khách " +
                user.showThongtinmuahang() +
                ", Đã chọn = " + product.thongtindonhang() +
                ", Số lượng sản phẩm = " + numberOfSelected +
                ", Số tiền = " + tongTien() ;
    }



}

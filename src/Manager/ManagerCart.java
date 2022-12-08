//package Manager;
//
//import Model.Cart;
//import Model.Item;
//import Model.Product;
//import io.ReadAndWrite;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//
//public class ManagerCart {
//    static ArrayList<Cart> carts = new ArrayList<>();
//    ReadAndWrite<Cart> rawCart = new ReadAndWrite<>();
//    ReadAndWrite<Product> rawProduct = new ReadAndWrite<>();
//    ManagerProduct managerProduct = new ManagerProduct();
//    static Cart cart;
//
//    {
//        carts = rawCart.read("Carts.txt");
//        ManagerProduct.products = rawProduct.read("Products.txt");
//    }
//
////    public Cart returnCart() {
////
////        for (Item it : ManagerItem.items) {
////            if (it.getUser().getUserName().equals(ManagerUser.user.getUserName())) {
////                cart = new Cart();
////            }
////        }
////        return cart;
////    }
//
//    public void addCart(Cart cart) {
//        carts.add(cart);
//        rawCart.write(carts, "Carts.txt");
//    }
//
//
////    public void tonKho(Cart cart) {
////        int tonKho = 0;
////
////        int index = timVitrisp(cart);
////        if (index != -1) {
////            for (int i = 0; i < carts.size(); i++) {
////                tonKho = ManagerProduct.products.get(index).getAmount() - cart.getItem().getNumberOfSelected();
////            }
////        }
////        ManagerProduct.products.get(index).setAmount(tonKho);
////        rawProduct.write(ManagerProduct.products, "Products.txt");
////    }
//
//
////    public int timVitrisp(Cart cart) {
////        for (int i = 0; i < ManagerProduct.products.size(); i++) {
////            if (cart.getItem().getProduct().getProducsName().
////                    equals(ManagerProduct.products.get(i).getProducsName())) {
////                return i;
////            }
////        }
////        return -1;
////    }
//
////    public double tongbill() {
////        double totalbill = 0;
////        for (int i = 0; i < carts.size(); i++) {
////            if (carts.get(i).getItem().getUser().getUserName().equals(ManagerUser.user.getUserName())) {
////                totalbill += carts.get(i).getItem().tongTien();
////            }
////        }
////        return totalbill;
////
////    }
//
////    public void showBill() {
////        for (Cart cart :
////                carts) {
////            if (cart.getItem().getUser().getUserName().equals(ManagerUser.user.getUserName())) {
////                System.out.println(cart.toString());
////            }
////        }
////    }
//
//    public void showCart() {
//        for (Cart cart :
//                carts) {
//            System.out.println(cart.toString());
//        }
//    }
//
//    public void showItemdachon() {
//        for (Cart cart:
//             carts) {
//            System.out.println(cart.getItem().toString());
//        }
//    }
//
////    public ArrayList<Cart> findCartByUserName(String usrName, LocalDate date) {
////        ArrayList<Cart> carts1 = new ArrayList<>();
////        for (int i = 0; i < carts.size(); i++) {
////            if (carts.get(i).getNgayBan().equals(date) &&
////                    cart.getItem().getUser().getUserName().equals(usrName)) {
////                carts1.add(carts.get(i));
////            }
////        }
////        return carts1;
////    }
//
//}

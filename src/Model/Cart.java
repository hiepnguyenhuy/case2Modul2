//package Model;
//
//import java.io.Serializable;
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.Date;
//
//public class Cart implements Serializable {
//    private ArrayList<Item> item;
//    private LocalDate ngayBan;
//
//    public Cart()  {
//        this.ngayBan = LocalDate.now();
//        this.item= new ArrayList<Item>();
//    }
//
//
//    public ArrayList<Item> getItem() {
//        return item;
//    }
//
//    public void setItem(ArrayList<Item> item) {
//        this.item = item;
//    }
//
//    public LocalDate getNgayBan() {
//        return ngayBan;
//    }
//
//    public void setNgayBan(LocalDate ngayBan) {
//        this.ngayBan = ngayBan;
//    }
//
//    @Override
//    public String toString() {
//        return "Bills{" +
//                "item=" + item +
//                ", ngayBan=" + ngayBan +
//                '}';
//    }
//    public String hienthiItemdachon() {
//        return "Bills{" +
//                "item=" + item +
//                ", ngayBan=" + ngayBan +
//                '}';
//    }
//
//}

package Model;

import java.io.Serializable;

public class User implements Serializable {
    private String userName;
    private String passWord;

    private String fullName;
    private int phoneNumber;
    private String address;

    public User() {
    }

    public User(String userName, String passWord, String fullName, int phoneNumber, String address) {
        this.userName = userName;
        this.passWord = passWord;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }

    public String showThongtinmuahang() {
        return
                 userName + '\'' +

                ", Họ và tên='" + fullName + '\''


                ;
    }
}

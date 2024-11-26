package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Bank {
    private String id;
    private String tenNganHang;
    private List<User> listUser;
    public Bank(String id, String tenNganHang) {
        this.id = id;
        this.tenNganHang = tenNganHang;
        this.listUser = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenNganHang() {
        return tenNganHang;
    }

    public void setTenNganHang(String tenNganHang) {
        this.tenNganHang = tenNganHang;
    }

    public List<User> getListUser() {
        return listUser;
    }

    public void setListUser(List<User> listUser) {
        this.listUser = listUser;
    }
    public float tinhTongSoTien(){
        // foreach - or dung` for thuong` (index)
        float sum = 0;
        for (User user : listUser) {
            sum += user.getSoDu();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id='" + id + '\'' +
                ", tenNganHang='" + tenNganHang + '\'' +
                ", listUser=" + listUser +
                '}';
    }
}

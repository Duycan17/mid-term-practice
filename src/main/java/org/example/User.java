package org.example;

public class User implements IUser{
    private String id;
    private String tenNguoiDung;
    private String namSinh;
    private String idNganHang;
    private String soTaiKhoan;
    private float soDu;
    private String diaChi;
    private boolean isKhachHangThanThiet;

    public User(String id, String tenNguoiDung, String namSinh, String idNganHang, String soTaiKhoan, float soDu, String diaChi) {
        this.id = id;
        this.tenNguoiDung = tenNguoiDung;
        this.namSinh = namSinh;
        this.idNganHang = idNganHang;
        this.soTaiKhoan = soTaiKhoan;
        this.soDu = soDu;
        this.diaChi = diaChi;
        this.isKhachHangThanThiet = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getIdNganHang() {
        return idNganHang;
    }

    public void setIdNganHang(String idNganHang) {
        this.idNganHang = idNganHang;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public float getSoDu() {
        return soDu;
    }

    public void setSoDu(float soDu) {
        this.soDu = soDu;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isKhachHangThanThiet() {
        return isKhachHangThanThiet;
    }

    public void setKhachHangThanThiet(boolean khachHangThanThiet) {
        isKhachHangThanThiet = khachHangThanThiet;
    }


    @Override
    public void napTien(float soTien) {
        this.soDu = this.soDu + soTien;
        updateKhachHangThanThiet();
    }

    @Override
    public void chuyenTien(float soTien) {
//    Kiem tra so tien chuyen >= so du truoc khi chuyen
        if (isKhachHangThanThiet)
        {

        }
        else
        this.soDu = this.soDu - soTien - 2000;
    }

    @Override
    public void rutTien(float soTien) {
//        Kiem tra so tien rut >= so du truoc khi rut

        this.soDu = this.soDu - soTien;
        updateKhachHangThanThiet();
    }

    @Override
    public void kiemTraSoDu() {
        System.out.println("So du cua ban la: " + this.soDu);
    }
    private void updateKhachHangThanThiet(){
        if (this.soDu >= 10000000){
            this.isKhachHangThanThiet = true;
        }
        else
        {
            this.isKhachHangThanThiet = false;
        }
    }
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", tenNguoiDung='" + tenNguoiDung + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", idNganHang='" + idNganHang + '\'' +
                ", soTaiKhoan='" + soTaiKhoan + '\'' +
                ", soDu=" + soDu +
                ", diaChi='" + diaChi + '\'' +
                ", isKhachHangThanThiet=" + isKhachHangThanThiet +
                '}';
    }
}

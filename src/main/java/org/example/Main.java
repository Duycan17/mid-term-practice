package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bank agribank = new Bank("1","Agribank");
        User user1 = new User("1","Nguyen Van A","1990","1","123456",0,"Ha Noi");
        User user2 = new User("2","Nguyen Van B","1991","1","123457",0,"Ha Noi");
        agribank.getListUser().add(user1);
        agribank.getListUser().add(user2);
        user1.setSoDu(2000000);
        user2.setSoDu(30000);
        // foreach
//        for (User user : agribank.getListUser()){
//            System.out.println(user);
//        }
        //
//        for (int i = 0; i < agribank.getListUser().size(); i++){
//            System.out.println(agribank.getListUser().get(i));
//        }
//        System.out.println(agribank.tinhTongSoTien());
        user1.napTien(8000000);
        System.out.println(user1.isKhachHangThanThiet());
//        user1.rutTien(10000);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap so tai khoan nguoi nhan");
//        String soTaiKhoanNguoiNhan = sc.nextLine();
////        Sau khi co stk nguoi nhan -> Duyet trong listUser xem user nao co stk == soTaiKhoanNguoiNhan and id == idNguoiNhan (neu co)
////        tru tien cua nguoi gui va cong tien cua nguoi nhan
//        System.out.println(user1.getSoDu());
//        whhile (1: chuyen tien, 2)
    }
}
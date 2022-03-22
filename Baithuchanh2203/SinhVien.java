package Baithuchanh2203;

import java.util.Scanner;
public class SinhVien {
    public static void main(String[] args) throws Exception {
        SinhVien sv = new SinhVien();
        sv.NhapThongTin();
        sv.InThongTin();
}
    String HoTenSV;
    String MaSinhVien;
    Boolean GioiTinh;
    String DiaChi;
    String NgaySinh;
    Scanner sc = new Scanner(System.in);
    public void NhapThongTin() {
        System.out.println("Moi nhap ho ten sinh vien: ");
        HoTenSV = sc.nextLine();
        System.out.println("Moi nhap ma sinh vien: ");
        MaSinhVien = sc.nextLine();
        System.out.println("Moi nhap dia chi sinh vien: ");
        DiaChi = sc.nextLine();
        System.out.println("Moi nhap ngay sinh sinh vien: ");
        NgaySinh = sc.nextLine();
        System.out.println("Moi nhap gioi tinh sinh vien: ");
        GioiTinh = sc.nextBoolean();
    }
    public void InThongTin() {
        System.out.println("Ho ten sinh vien: " + HoTenSV);
        System.out.println("Ma sinh vien: " + MaSinhVien);
        System.out.println("Gioi tinh sinh vien: ");
        if(GioiTinh == true) {
            System.out.println("Nam");
       } else {
           System.out.println("Nu");
       }
        System.out.println("Dia chi sinh vien: " + DiaChi);
        System.out.println("Ngay sinh sinh vien: " + NgaySinh);
}
}

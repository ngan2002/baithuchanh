package Baithuchanh2203;
import java.util.Scanner;
public class App2203 {
    public static void main(String[] args) throws Exception {
         System.out.println("\n***********\n");
 
        System.out.println("~~~ HINH CHU NHAT ~~~");
        HinhChuNhat hcn =  new HinhChuNhat();
        hcn.NhapChieuDai();
        hcn.NhapChieuRong();
        hcn.TinhChuVi();
        hcn.TinhDienTich();
        hcn.InChuVi();
        hcn.InDienTich();

        System.out.println("\n***********\n");

        System.out.println("~~~ PERSON ~~~");
        Person ps = new Person();
        ps.NhapThongTin();
        ps.InThongTin();

        System.out.println("\n***********\n");

        System.out.println("~~~ SINH VIEN ~~~");
        SinhVien sv = new SinhVien();
        sv.NhapThongTin();
        sv.InThongTin();

        System.out.println("\n***********\n");

        System.out.println("~~~ PHUONG TRINH BAC 2 ~~~");
        PhuongTrinhBac2 pt = new PhuongTrinhBac2();
        pt.NhapThongTin();
        pt.TinhPTbac2();
        pt.InThongTin();
   }
}

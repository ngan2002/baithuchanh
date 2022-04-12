package Baithuchanh1204.main;

import Baithuchanh1204.SinhVien;

public class App72 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();

        sv1.setTen("");
        sv1.setTuoi(23);

        sv2.setTen("Peter");
        sv2.setTuoi(17);

        System.out.println("Sinh vien 1 co ten la: " + sv1.getTen() + "/n Sinh vien 1 co tuoi la: " + sv1.getTuoi());
        System.out.println("Sinh vien 2 co ten la: " + sv2.getTen() + "/n Sinh vien 2 co tuoi la: " + sv2.getTuoi());
}
}

package Baithuchanh1204.shapes;
import java.util.Scanner;
public class HinhVuong extends HinhChuNhat { 
    public float canh;
    public HinhVuong() {
        ten = "Hinh Vuong";
    }
    public void NhapCanh() {
        System.out.println("Moi nhap vao canh cua hinh vuong: ");
        Scanner sc = new Scanner(System.in);
          canh = sc.nextFloat();
    }
    public void TinhChuVi() {
        chuVi = 4 * canh;
    }

    public void TinhDienTich() {
        dienTich = canh * canh;
    }
}


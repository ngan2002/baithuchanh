package Baithuchanh1204.shapes;
import java.util.Scanner;
public class HinhTron extends HinhHoc {
    public float banKinh;
    public HinhTron() {
        ten = "Hinh Tron";
    }
    public void nhapBankinh() {
        System.out.println("Ban kinh la: " );
        Scanner sc = new Scanner(System.in);
              banKinh = sc.nextFloat();
    }
    public void TinhChuvi() {
        chuVi = 2 * PI * banKinh;
    }
    public void TinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }
}

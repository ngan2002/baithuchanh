package Baithuchanh1204.shapes;
import java.util.Scanner;
public class HinhTru extends HinhTron {
    public float chieucao;
    public HinhTru() {
        ten = "Hinh Tru";
    }
    public void nhapChieuCao() {
        nhapBankinh();
        System.out.println("Chieu cao la: ");
        Scanner sc = new Scanner(System.in);
              chieucao = sc.nextFloat();
    }
    public void tinhThetich() {
        TinhDienTich();
        theTich = dienTich * chieucao;
    }
}
package Baithuchanh1204.shapes;
import java.util.Scanner;
    public class HinhChuNhat extends HinhHoc {
        public float dai;
        public float rong;
        public HinhChuNhat() {
            ten = "Hinh Chu Nhat";
        }
        public void NhapChieuDai() {
            System.out.println("Moi nhap vao chieu dai cua hinh chu nhat: ");
            Scanner sc = new Scanner(System.in);
              dai = sc.nextFloat();
        }
        public void NhapChieuRong() {

            System.out.println("Moi nhap vao chieu rong cua hinh chu nhat: ");
            Scanner sc = new Scanner(System.in);
              rong = sc.nextFloat();
        }

        public void TinhChuVi() {
            chuVi = 2 * ( dai + rong);
        }

        public void TinhDienTich() {
            dienTich = dai * rong;
        }
 }



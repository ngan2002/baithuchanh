package Baithuchanh2203;
import java.util.Scanner;
public class HinhChuNhat {
    public static void main(String[] args) throws Exception {
        HinhChuNhat hcn =  new HinhChuNhat();
        hcn.NhapChieuDai();
        hcn.NhapChieuRong();
        hcn.TinhChuVi();
        hcn.TinhDienTich();
        hcn.InChuVi();
        hcn.InDienTich();
       }
        private float a, b;
        private float cv;
        private float dt;
        Scanner sc = new Scanner(System.in);
        public void NhapChieuDai() {
            System.out.println("Moi nhap vao chieu dai cua hinh chu nhat: ");
              a = sc.nextFloat();
        }
        public void NhapChieuRong() {

            System.out.println("Moi nhap vao chieu rong cua hinh chu nhat: ");
              b = sc.nextFloat();
        }

        public void TinhChuVi() {
            cv = 2 * ( a + b);
        }

        public void TinhDienTich() {
            dt = a * b;
        }

        public void InChuVi() {

            System.out.println("Chu vi Hinh chu nhat la : " + cv);
        }

        public void InDienTich() {

            System.out.println("Dien tich Hinh chu nhat la : " + dt);
        }
 }





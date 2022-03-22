package Baithuchanh2203;

import java.util.Scanner;

public class App16 {
    public static void main(String[] args) throws Exception {
     HinhTron ht = new App16(). new HinhTron();
     ht.NhapBankinh();
     ht.TinhChuvi();
     ht.TinhDienTich();
     ht.InChuvi();
     ht.InDientich();
    }
    class HinhTron {
   
        final float PI = 3.14f;
        float r;
        float cv;
        float dt;
       void NhapBankinh() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Moi nhap vao ban kinh hinh tron: ");
              r = sc.nextFloat();
        }

        void TinhChuvi() {
            cv = 2 * PI * r;
        }

        void TinhDienTich() {
            dt = PI * r * r;
        }

        void InChuvi() {

            System.out.println("Chu vi Hinh tron: " + cv);
        }

        void InDientich() {

            System.out.println("Dien tich Hinh tron: " + dt);
        }
    }
}


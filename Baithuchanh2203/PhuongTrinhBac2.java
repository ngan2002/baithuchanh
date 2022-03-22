package Baithuchanh2203;
import java.util.Scanner;
public class PhuongTrinhBac2 {
    public static void main(String[] args) throws Exception {
        PhuongTrinhBac2 pt = new PhuongTrinhBac2();
        pt.NhapThongTin();
        pt.TinhPTbac2();
        pt.InThongTin();
}
    double a, b, c;
    double x1, x2;
    double Delta;
    Scanner sc = new Scanner(System.in);
    void NhapThongTin() {
     System.out.println("Moi nhap so thu nhat: ");
      a = sc.nextDouble();
      System.out.println("Moi nhap so thu hai: ");
      b = sc.nextDouble();
      System.out.println("Moi nhap so thu ba: ");
      c = sc.nextDouble();
    }
    void TinhPTbac2(){
       Delta = ( b * b ) - ( 4 * a * c );
       if( Delta < 0) {
           System.out.println("Phuong trinh bac 2 vo nghiem");
       } else if( Delta == 0) {
         x1 = x2 = ( -b ) / ( 2 * a );
         System.out.println("Phuong trinh bac 2 có 1 nghiem duy nhat x1 = x2 = " + x1);
       } else {
        x1 = (-b + Math.sqrt(Delta)) / (2 * a);
        x2 = (-b - Math.sqrt(Delta)) / (2 * a);
        System.out.println("Phương trình có 2 nghiệm x1 = " + x1 + " và x2 = " + x2);
    }
}
    void InThongTin(){
        System.out.println("Phuong trinh bac 2 co dang la: "+a+ "x^2 +" +b+"x +"+c);
        System.out.println("Nghiem cua phuong trinh bac 2 la: "+x1+" va "+x2);
    }
}

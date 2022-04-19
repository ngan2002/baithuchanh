package Baithuchanh1904;
import java.util.Scanner;
public class Employee extends Person {
    public double Nghenghiep;
    public double tuoi;
    public long luong;

 public void nhapNghenghiep() {
    System.out.println("Nghe nghiep hien tai la: ");
    Scanner sc = new Scanner(System.in);
          Nghenghiep = sc.nextDouble();
 }
 public void nhaptuoi() {
    System.out.println("Tuoi la: ");
    Scanner sc = new Scanner(System.in);
          tuoi = sc.nextDouble();
 }
 public void nhapluong() {
    System.out.println("Luong hien tai la: ");
    Scanner sc = new Scanner(System.in);
          luong = sc.nextLong();

 }
 protected String loaiEmployee() {
   return "";
}
 public void hienThiThongTin() {
    System.out.println("Nghề nghiêp la: " + Nghenghiep);
    System.out.println("Tuổi la: " + tuoi);
   System.out.println("Luong : " + luong + " VNĐ " );
}
}

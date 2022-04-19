package Baithuchanh1904;
import java.util.Scanner;
public class Student extends Person {
    public double tuoi;
    public String Diachi;
    public int id;

public void nhaptuoi() {
    System.out.println("Tuoi cua hoc sinh la: ");
    Scanner sc = new Scanner(System.in);
          tuoi = sc.nextDouble();

}
public void nhapDiachi() {
    System.out.println("Dia chi cua hoc sinh la: ");
    Scanner sc = new Scanner(System.in);
          Diachi = sc.nextLine();
}
public void nhapid() {
    System.out.println("ID cua hoc sinh la: ");
    Scanner sc = new Scanner(System.in);
          id = sc.nextInt();
}
public void hienThiThongTin() {
    System.out.println("Tuoi cua hoc sinh la: " + tuoi);
    System.out.println("Diachi cua hoc sinh  la: " + Diachi);
    System.out.println("ID cua hoc sinh  la: " + id);
}
}


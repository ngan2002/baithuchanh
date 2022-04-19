package Baithuchanh1904;
import java.util.Scanner;
public class Employee extends Person {
    private Double tuoi;

    public Employee(String ten, String Gioitinh, Double tuoi){
      super(ten, Gioitinh);
      this.tuoi = tuoi;
  }
  public String gettuoi() {
   return "tuoi";
}
public void settuoi(double tuoi) {
   this.tuoi = tuoi;
}

 public void nhaptuoi() {
    System.out.println("Moi nhap tuoi la: ");
    Scanner sc = new Scanner(System.in);
          tuoi = sc.nextDouble();
 }

 @Override
 public void hienThiThongTin() {
   System.out.println("Tuổi la: " + tuoi);
   
}
}

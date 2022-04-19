package Baithuchanh1904;
import java.util.Scanner;
public class Customer extends Person{
    private Double tuoi;
    private String Nghenghiep;
    private String Diachi;
    public Customer(String ten, String Gioitinh, Double tuoi, String Nghenghiep, String DiaChi){
        super(ten, Gioitinh);
        this.tuoi = tuoi;
        this.Nghenghiep = Nghenghiep;
        this.Diachi = DiaChi;
    }
    public Double gettuoi() {
        return tuoi;
     }
     public void settuoi(Double tuoi) {
        this.tuoi = tuoi;
     }
     public String getNghenghiep() {
        return Nghenghiep;
     }
     public void setNghenghiep(String Nghenghiep) {
        this.Nghenghiep = Nghenghiep;
     }
     public String getDiachi() {
        return " Diachi";
     }
     public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
     }
    public void nhaptuoi() {
        System.out.println("Tuoi cua khach hang la: ");
        Scanner sc = new Scanner(System.in);
              tuoi = sc.nextDouble();
    }
    public void nhapNghenghiep() {
        System.out.println("Nghe Nghiep cua khach hang la: ");
        Scanner sc = new Scanner(System.in);
              Nghenghiep = sc.nextLine();
    }
    public void nhapDiachi() {
        System.out.println("Đia chỉ cua khach hang la: ");
        Scanner sc = new Scanner(System.in);
              Diachi = sc.nextLine();
    } 
    @Override
    public void hienThiThongTin() {
      System.out.println("Tuoi cua khach hang la: " + tuoi);
      System.out.println("Nghe nghiep cua khach hang la: " + Nghenghiep );
      System.out.println("Dia chi cua khach hang la: " + Diachi);
   }

}

package Baithuchanh1904;
import java.util.Scanner;
public class Person {
    private String Hoten;
    private String Gioitinh;

    public Person() {

    }
    public Person(String Hoten, String Gioitinh) {
        this.Hoten = Hoten;
        this.Gioitinh = Gioitinh;
    
    }
    public String getten() {
        return Hoten;
    }

    public void setten(String ten) {
        this.Hoten = ten;
    }
    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }
    public void nhapThongtin() {
        System.out.println ("Moi nhap vao ho va ten: ");
        Scanner sc = new Scanner(System.in);
        Hoten = sc.nextLine();
        System.out.println("Moi nhap vao gioi tinh: ");
        Gioitinh = sc.nextLine();
    }
    public void hienThiThongTin() {
        System.out.println("Ho va ten la: " + Hoten);
        System.out.println("Gioi tinh la: " + Gioitinh);

    }
}


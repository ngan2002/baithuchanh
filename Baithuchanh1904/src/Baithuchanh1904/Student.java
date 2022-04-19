package Baithuchanh1904;
import java.util.Scanner;
public class Student extends Person {
    private String Diachi;
    private int STT;
    public Student(String ten, String DiaChi, int STT, String Gioitinh){
        super(ten, Gioitinh);
        this.Diachi = DiaChi;
        this.STT = STT;
    }
    public String getDiachi() {
        return Diachi;
    }
    
    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }
    public String getSTT() {
        return "STT";
    }
    
    public void setSTT(int STT) {
        this.STT = STT;
    }
    public void nhapDiachi() {
    System.out.println("Dia chi cua hoc sinh la: ");
    Scanner sc = new Scanner(System.in);
          Diachi = sc.nextLine();
}
    public void nhapSTT() {
    System.out.println("ID cua hoc sinh la: ");
    Scanner sc = new Scanner(System.in);
          STT = sc.nextInt();
}
@Override
public void hienThiThongTin() {
    System.out.println("Dia chi cua hoc sinh  la: " + Diachi);
    System.out.println("So thu tu cua hoc sinh  la: " + STT);
}
}


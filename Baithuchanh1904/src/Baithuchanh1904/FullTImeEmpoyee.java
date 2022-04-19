package Baithuchanh1904;
import java.util.Scanner;
public class FullTImeEmpoyee extends Employee{
    private String FullTime;
    private int luonghangthang;
    public FullTImeEmpoyee (Double tuoi, int luonghangthang,  String FullTime, String ten, String Gioitinh ){
        super(ten, Gioitinh, tuoi);
        this.FullTime = FullTime;
        this.luonghangthang = luonghangthang;
    }
    public long getluonghangthang() {
        return luonghangthang;
     }
     public void setluonghangthang(int luonghangthang) {
        this.luonghangthang = luonghangthang;
     }
    public String getFullTime() {
        return "FullTime";
    }
    public void setFullTime(String FullTime) {
        this.FullTime = FullTime;
    }
    @Override
    public void hienThiThongTin() {
        System.out.println("Day la Nhan Vien lam Full Time : " + FullTime);
        System.out.println("Luong : " + luonghangthang + " VNĐ " );
    } 
}





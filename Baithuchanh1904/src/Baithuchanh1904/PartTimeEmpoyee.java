package Baithuchanh1904;
import java.util.Scanner;
public class PartTimeEmpoyee extends Employee {
    private String PartTime;
    private int luongmotngay;
    public PartTimeEmpoyee (Double tuoi, int luongmotngay, String PartTime, String ten, String Gioitinh ){
        super(ten, Gioitinh, tuoi);
        this.PartTime = PartTime;
        this.luongmotngay = luongmotngay;
    }
    public String getPartTime() {
        return "PartTime";
    }
    public void setFullTime(String PartTime) {
        this.PartTime = PartTime;
    }
    public long getluongmotngay() {
        return luongmotngay;
     }
     public void setluongmotngay(int luongmotngay) {
        this.luongmotngay = luongmotngay;
     }
    @Override
    public void hienThiThongTin() {
        System.out.println("Day la Nhan Vien lam Part Time " + PartTime);
        System.out.println("Luong nhan vien lam PartTime mot ngay la: " + luongmotngay + " VNĐ " );
    } 
}
    


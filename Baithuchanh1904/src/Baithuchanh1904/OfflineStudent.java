package Baithuchanh1904;
import java.util.Scanner;
public class OfflineStudent extends Student{
    
    private String HocOffline;
    public OfflineStudent( String ten, String DiaChi, int STT, String Gioitinh, String HocOffline){
        super( ten, DiaChi, STT, Gioitinh);
        this.HocOffline = HocOffline;
    }
    public String getHocOffline() {
        return "HocOffline";
    }
    public void setHocOffline(String HocOffline) {
        this.HocOffline = HocOffline;
    }
    @Override
    public void hienThiThongTin() {
        System.out.println("Đay la hoc sinh học offline: " + HocOffline);
    } 
}

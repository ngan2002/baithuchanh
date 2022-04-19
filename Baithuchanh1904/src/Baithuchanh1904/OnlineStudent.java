package Baithuchanh1904;
import java.util.Scanner;
public class OnlineStudent extends Student{
    
    private String HocOnline;
    public OnlineStudent( String ten, String DiaChi, int STT, String Gioitinh, String HocOnline){
        super( ten, DiaChi, STT, Gioitinh);
        this.HocOnline = HocOnline;
    }
    public String getHocOffline() {
        return "HocOffline";
    }
    public void setHocOnline(String HocOnline) {
        this.HocOnline = HocOnline;
    }
    @Override
    public void hienThiThongTin() {
        System.out.println("Đay la hoc sinh hoc Online : " + HocOnline);
    } 
}


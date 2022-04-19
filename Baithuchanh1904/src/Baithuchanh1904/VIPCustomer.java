package Baithuchanh1904;
import java.util.Scanner;
public class VIPCustomer extends Customer {
    private String KhachVIP;
    public VIPCustomer (Double tuoi, String Nghenghiep, String KhachVIP, String ten, String Gioitinh, String Diachi){
        super(ten, Gioitinh, tuoi, Nghenghiep, Diachi);
        this.KhachVIP = KhachVIP;
    }
    public String getKhachVIP() {
        return KhachVIP;
    }
    public void setKhachVIP(String KhachVIP) {
        this.KhachVIP = KhachVIP;
    }
    @Override
    public void hienThiThongTin() {
        System.out.println("Đay là Khach Hang VIP la: " + KhachVIP);
    } 
}

package Baithuchanh1204.Slide79;
import java.util.Scanner;
public class NhanVien {
    protected String ten;
    protected long luong;

    public NhanVien() {

    }
    public NhanVien(String ten) {
        this.ten = ten;
    }
    protected String loaiNhanVien() {
        return "";
    }
    public void xuatThongtin() {
        System.out.println("Nhan Vien: " + ten );
        System.out.println("Loai Nhan Vien: " + loaiNhanVien() );
        System.out.println("Luong : " + luong + " VNĐ " );
    }
}

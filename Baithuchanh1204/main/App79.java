package Baithuchanh1204.main;
import Baithuchanh1204.Slide79.Configs;
import Baithuchanh1204.Slide79.NhanVien;
import Baithuchanh1204.Slide79.NhanVienPartTime;
import Baithuchanh1204.Slide79.NhanVienFullTime;
public class App79 {
    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("Nguyen Thi A");
        sep.loaiChucVu();

        NhanVienFullTime linh1 = new NhanVienFullTime("Tran Van B"); 
        linh1.loaiNhanVien();

        NhanVienFullTime linh2 = new NhanVienFullTime("Tran Thi C", 5); 
        linh2.loaiNhanVien();

        
        NhanVienPartTime ThoiVu = new NhanVienPartTime("Vu Thi D", 350); 
       
        System.out.println("Loai Chuc Vu :");
        System.out.println("\t1 = sep " );
        System.out.println("\t2 = linh");

        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        ThoiVu.tinhLuong();
      
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        ThoiVu.xuatThongTin();
    }

}

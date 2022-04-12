package Baithuchanh1204.Slide79;
import java.util.Scanner;
import Baithuchanh1204.Slide79.Configs;
public class NhanVienPartTime extends NhanVien {
    private int Giolamviec;
    
    public NhanVienPartTime(String ten, int Gioilamviec) {
        this.ten = ten;
      this.Giolamviec = Giolamviec;
    }
       @Override
       public String loaiNhanVien() {
           return "Nhan vien thoi vu";
       }
       public void tinhLuong() {
           luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * Giolamviec;
       
        }
        public void xuatThongTin(){
            System.out.println("ten nhan vien : " + ten);
            System.out.println("La nhan vien thoi vu " );
            System.out.println("Luong nhan vien la: "+ luong);
            
        }
    }

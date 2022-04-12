package Baithuchanh1204.Slide79;
import java.util.Scanner;
import Baithuchanh1204.Slide79.Configs;
public class NhanVienFullTime extends NhanVien {
    private int NgayLamThem;
    private int loaiChucVu;

    public NhanVienFullTime(String ten) {
        this.ten = ten;
    }
    public NhanVienFullTime(String ten, int NgayLamThem) {
        this.ten = ten;
      this.NgayLamThem = NgayLamThem;
    }
    public void loaiChucVu() {
        this.loaiChucVu = loaiChucVu;
    }
    @Override
       public String loaiNhanVien() {
           return "Nhan vien toan thoi gian";
       }
       public void tinhLuong() {
           if (loaiChucVu == Configs.NHAN_VIEN_LINH) {
               luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + NgayLamThem * 800000;
           } else {
               luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + NgayLamThem * 800000; 
           }
        }
           public void xuatThongTin() {
            System.out.println("ten nhan vien : " + ten );
            System.out.println("loai chuc vu :" + loaiChucVu);
            System.out.println("So ngay lam them la:"+ NgayLamThem);
            System.out.println("Luong:" + luong);
        }
}


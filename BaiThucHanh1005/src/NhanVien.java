import java.util.Scanner;
public class NhanVien {
    public String MaNhanVien;
    public String HoTenNhanVien;
    public String Diachi;

    public NhanVien (String MaNhanVien, String HoTenNhanVien, String Diachi) {
        this.HoTenNhanVien = HoTenNhanVien;
        this.MaNhanVien = MaNhanVien;
        this.Diachi = Diachi;
    }


    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Moi nhap vao Ma Nhan Vien la : ");
        MaNhanVien = sc.nextLine();
        System.out.println ("Moi nhap vao Ho va Ten Nhan Vien la : ");
        HoTenNhanVien = sc.nextLine();
        System.out.println ("Moi nhap vao Dia Chi Nhan Vien la : ");
        Diachi = sc.nextLine();

    }

    public void inThongTin() {
        System.out.println ("Ma Nhan Vien la : " + MaNhanVien);
        System.out.println ("Ho Ten Nhan Vien la : " + HoTenNhanVien);
        System.out.println ("Dia chi Nhan Vien la : " + Diachi);
    }
}
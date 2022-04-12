package Baithuchanh1204.main;
import Baithuchanh1204.shapes.HinhHoc;
import Baithuchanh1204.shapes.HinhChuNhat;
import Baithuchanh1204.shapes.HinhTron;
import Baithuchanh1204.shapes.HinhVuong;
import Baithuchanh1204.shapes.HinhTru;
public class App54 {
    public static void main(String[] args) throws Exception {
        
        HinhChuNhat hcn =  new HinhChuNhat();
        hcn.xuatTen();
        hcn.NhapChieuDai();
        hcn.NhapChieuRong();
        hcn.TinhChuVi();
        hcn.TinhDienTich();
        hcn.inChuvi();
        hcn.inDientich();

        System.out.println("\n***********\n");

        HinhTron ht = new HinhTron();
        ht.xuatTen();
        ht.nhapBankinh();
        ht.TinhChuvi();
        ht.TinhDienTich();
        ht.inChuvi();
        ht.inDientich();

        System.out.println("\n***********\n");
        
        HinhTru hTr = new HinhTru();
        hTr.xuatTen();
        hTr.nhapChieuCao();
        hTr.tinhThetich();
        hTr.inThetich();
        
        System.out.println("\n***********\n");

        HinhVuong hv = new HinhVuong();
        hv.xuatTen();
        hv.NhapCanh();
        hv.TinhChuVi();
        hv.TinhDienTich();
        hv.inChuvi();
        hv.inDientich();

    }
}


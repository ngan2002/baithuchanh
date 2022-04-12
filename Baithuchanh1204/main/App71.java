package Baithuchanh1204.main;

import Baithuchanh1204.Slide71.Hinhtron;
import Baithuchanh1204.Slide71.ToaDo;

public class App71 {
    public static void main(String[] args) {
            Hinhtron ht = new Hinhtron();
            ToaDo td = new ToaDo();

            ht.setbanKinh(10);
            ht.getBanKinh();
            ht.tinhChuvi();
            ht.tinhDienTich();
            
            float Chuvi = ht.tinhChuvi();
            float DienTich = ht.tinhDienTich();

    System.out.println("Chu vi cua Hinh Tron la: " + Chuvi);
    System.out.println("Dien tich cua Hinh Tron la: " + DienTich); 

    System.out.println("\n***********\n");
    
            td.getX();
            td.getY();
            td.setX(20);
            td.setY(20);
        } 
   }

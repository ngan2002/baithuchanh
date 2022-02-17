package com.example;

import java.util.Scanner;

public class Baithuchanh1502  {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in); 
        int n, soDu, tong = 0;

        System.out.println("Nhap vao so nguyen duong bat ky: ");
        n = sc.nextInt();

        while (n > 0) {
            soDu = n % 10;
            n = n / 10;
            tong += soDu;
        }

        System.out.println("Tong cac chu so = " + tong);
    }
}
package com.example;

import java.util.Scanner;

public class App47 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("Moi nhap vao so nguyen bat ky: ");
        n = sc.nextInt();
        int sum =0;
        do {
            
            sum += n;
        }
        while (sum < 100);
        System.out.println("Tong cac so nguyen vua nhap là: "+ sum);
        
    }
    
}

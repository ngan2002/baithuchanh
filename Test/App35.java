package com.example;

import java.util.Scanner;

public class App35 {
public static void main(String[] args) throws Exception {
    Scanner sc =new Scanner(System.in);
    int a, b;
    System.out.println("Moi nhap so nguyen a: ");
    a = sc.nextInt();
    System.out.println("Moi nhap so nguyen b: ");
    b = sc.nextInt();
    int min = 0;
    if (a > b){
    min = b;
    
    }else{ 
        min = a;
    
    }
    System.out.println("Gia tri nho nhat la : " + min);
}
}

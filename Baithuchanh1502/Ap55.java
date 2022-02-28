package com.example;

import java.util.Scanner;

public class Ap55 {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        System.out.println("Cac so chia het cho 5 la: ");
        for (int i = 0; i <= 20; i++) {
            if (i % 5 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}

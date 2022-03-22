package Baithuchanh2203;
import java.util.Scanner;

public class Person {
    public static void main(String[] args) throws Exception {
        Person ps = new Person();
        ps.NhapThongTin();
        ps.InThongTin();
    }
    String PersonID;
    String PersonName;
    Boolean Gender;
    String Address;
    
        Scanner sc = new Scanner(System.in);
    public void NhapThongTin() {
        System.out.println("Moi nhap cac thong tin");
        System.out.println("Moi nhap ID: ");
        PersonID = sc.nextLine();
        System.out.println("Moi nhap ten: ");
        PersonName = sc.nextLine();
        System.out.println("Moi nhap dia chi: ");
        Address = sc.nextLine();
        System.out.println("Moi nhap gioi tinh: ");
        Gender = sc.nextBoolean();
    }
    public void InThongTin() {
        System.out.println("ID: " + PersonID);
        System.out.println("Ten: " + PersonName);
        System.out.println("Gioi tinh: ");
        if(Gender == true) {
            System.out.println("Nam");
       } else {
           System.out.println("Nu");
       }
        System.out.println("Dia chi: " + Address);

    }
}



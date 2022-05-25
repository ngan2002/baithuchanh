import java.util.LinkedList;
import java.util.Scanner;
public class Ap111 {
    public static void main(String[] args){
        LinkedList<Integer> link = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);

        int n;
        int a;
        System.out.println("Moi nhap vao so cac so nguyen duong la: ");
        n = sc.nextInt();
        
        int tong = 0;
        for(int i=1; i<=n; i++) {
            System.out.println(" Moi nhap so thu " + i + ": ");
            a = sc.nextInt();
            if (a % 2 == 0) {
            tong += a;
        
            }
            link.add(a);
        }
        for (int i=0; i<link.size();i++){
            n++;
            tong += link.get(i);
        }
        
    
        int trungBinhcong = tong / n;
        System.out.println(" Trung binh cong cua n so nguyen duong chan la: " + trungBinhcong);

    }
    }


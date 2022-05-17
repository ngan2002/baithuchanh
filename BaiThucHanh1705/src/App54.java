import java.util.HashSet;
import java.util.Scanner;
public class App54 {
    public static void main(String[] args) throws Exception {
        int number;
        HashSet<Integer > hashSetInteger = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8);

        System.out.println("Cac phan tu trong App54 la: " + hashSetInteger);
        System.out.println("Nhap cac phan tu can them: ");
        number = sc.nextInt();

        if (hashSetInteger.contains(number)) {
        System.out.println("Them thanh cong!");
        System.out.println("Cac phan tu trong App54 sau khi them: " + hashSetInteger);
    } else {
        System.out.println("Phan tu" + number + " da ton tai!");;
    }



    }
} 
  
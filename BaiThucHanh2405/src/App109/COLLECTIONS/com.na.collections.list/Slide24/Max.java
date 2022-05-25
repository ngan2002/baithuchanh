import java.util.ArrayList;
import java.util.Scanner;
public class Max {
    public static void main(String[] args){
        ArrayList<Integer> arrListIntegers  = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int number;
    System.out.println("Nhap so phan tu cua ArrayList: ");
    int n = sc.nextInt();
    for (int i =0; i <n; i++) {
        System.out.println("Nhap phan tu thu" + i + ":");
        number = sc.nextInt();
        arrListIntegers.add(number);
    }
    int Max = arrListIntegers.get(0);
    for(int i =1; i< arrListIntegers.size();i++) {
        if (arrListIntegers.get(i).compareTo(Max) > 0) {
           Max = arrListIntegers.get(i);
        }
    }
    System.out.println("Phan tu lon nhat trong arrListInteger = " + Max);
}
}

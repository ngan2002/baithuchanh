import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
public class App110 {
    public static void main(String[] args) {
         int n;
//Tìm số nguyên có giá trị lớn nhất
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua App110 la : ");
        n = sc.nextInt();

        int a[] = new int[n];
       
        
        for (int i = 0; i < n; i++) {
        System.out.print("Nhap phan tu thu " + i + ": ");
        a[i] = sc.nextInt();
        arr.add(a[i]);
    }
    int Max = arr.get(0);
    for(int i =1; i< arr.size();i++) {
        if (arr.get(i).compareTo(Max) > 0) {
           Max = arr.get(i);
        }
    }
    System.out.println("Cac phan tu co trong App110 la: " + arr);
    System.out.println("Phan tu lon nhat trong App110 la: " + Max);

//Nhập vào 1 số nguyên, xoá khỏi mảng các phần từ có giá trị bằng giá trị vừa nhập
    int x;
    System.out.println("Moi nhap so nguyen x la: ");
    x = sc.nextInt();
    
        for(int i=0; i< arr.size(); i++){
            if(arr.get(i) == x){
                arr.remove(i);
            }
        }
    
        System.out.println("Cac phan tu con lai trong App110 sau khi xoa phan tu " + x + " la: " );
        for (int i = 0; i< arr.size(); i++) {
            System.out.print(arr.get(i) + "\t");
    
    }

    // Sắp xếp dãy số và in dãy số ra màn hình
      arr.sort(Comparator.naturalOrder());
    
    for(int i=0; i<arr.size();i++){
        System.out.println(arr.get(i)+"\t");
        System.out.println("Cac phan tu sau khi duoc sap xep trong App110 la: ");
        for ( i = 0; i< arr.size(); i++) {
            System.out.print(arr.get(i) + "\t");
    
    }
}
}
}

          
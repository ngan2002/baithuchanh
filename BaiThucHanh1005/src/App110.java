import java.util.ArrayList;
import java.util.Scanner;
public class App110 {
    public static void main(String[] args) {
         int n;
         
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
        int max = a[0];
    
        for (int num: a) {
            if(max < num)
              max = num;
          }
          int c = n; 
          System.out.println("Moi nhap vao so nguyen x la: ");
          int x = sc.nextInt();
       for (int i = c = 0; i < c; i++) {
        if (a[i] != x) {
            a[c] = a[i];
            c++;
         }
    }

    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j <= n - 1; j++) {
            if (a[i] < a[j]) {
                int swap = a[i];
                swap = a[j];
                a[i] = a[j];
                
            }
        }
    }
        System.out.println("Cac phan tu co trong App110 la: " + arr);
        System.out.println("Phan tu lon nhat trong App110 la: " + max);
        System.out.println("Cac phan tu còn lại trong App110 sau khi xóa phần tử " + x + " là: " );
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
    
    }
        System.out.println("Cac phan tu  sau khi duoc sap xep trong App110 la: ");
        for(int i=0; i<n; i++)
    {
        System.out.print(a[i]+" ");
    }

}
}

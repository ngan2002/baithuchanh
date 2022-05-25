import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;
public class App113 {
    public static void main(String[] args) {
        String tenTraiCay;
        int n;
        Scanner scanner = new Scanner(System.in);
     
        HashSet<String> hash = new HashSet<String>();
         
        System.out.println("Moi nhap vao so loai trai cay trong hash: ");
        n = Integer.parseInt(scanner.nextLine());  
             
        System.out.println("Moi nhap vao ten cac loai trai cay : ");
        for (int i = 0; i < n; i++) {
            System.out.print("Ten loai trai cay thu " + i + ": ");
            tenTraiCay = scanner.nextLine();
            hash.add(tenTraiCay);
        }
     
        System.out.println("So phan tu cua hash = " + hash.size());
          
        System.out.println("Nhap ten loai trai cay can tim: ");
        String timTraiCay = scanner.nextLine();
        if (hash.contains(timTraiCay)) {
            System.out.println("Co trai cay " + timTraiCay + " trong hash!");
        } else {
            System.out.println("Khong co teai cay " + timTraiCay);
        }
             
        System.out.println("Moi nhap ten loai trai cay can xoa la : ");
        String xoaTraiCay = scanner.nextLine();
     
        if (hash.contains(xoaTraiCay)) {
            hash.remove(xoaTraiCay);
            System.out.println("Da xoa trai cay thanh cong!");
            System.out.println("Cac trai cay con lai trong hash: " + hash);
        } else {
            System.out.println("Xóa không thành công!");
        }
             
        List<String> listFruits = new ArrayList<>();
        listFruits.add("Buoi");
        listFruits.add("Le");
        listFruits.add("Xoai");
        listFruits.add("Mang cut");
     
        hash.addAll(listFruits);
        System.out.println("Các phần tử có trong hashSetFruits sau khi thêm: ");
        Iterator<String> iterator = hash.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
    
        hash.removeAll(listFruits);
        System.out.println("\nCác phần tử có trong hashSetFruits sau khi xóa: " + hash);
    }
    }


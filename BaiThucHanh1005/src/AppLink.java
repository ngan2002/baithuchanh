import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class  AppLink {
    public static void main(String[] args){
        LinkedList<String> link = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);

        link.add("Ngay Sinh");
        link.add("Gioi Tinh");
        link.add("SDT");
        System.out.println("Các phần tử có trong AppLink là: " + link);
        ShowList(link);
        
        System.out.println("***********************");
        
        
        link.remove("Ngay Sinh");
        System.out.println("Các phần tử trong AppLink sau khi xóa la: " + link);
        ShowList(link);

        System.out.println("***********************");


        link.set(1,"Nam Sinh");
        System.out.println("Các phần tử trong AppLink sau khi sua chua: " + link);
        ShowList(link);



    }
    public static void ShowList(LinkedList<String> link) {
        for (String obj : link) {
            System.out.println("\t" + obj + ",");
        }
        System.out.println();
    }
    
}

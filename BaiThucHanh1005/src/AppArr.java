import java.util.ArrayList;
public class AppArr {
    public static void main(String[] args){
        ArrayList<String> arr  = new ArrayList<>();
        arr.add("Ngay Sinh");
        arr.add("Gioi Tinh");
        arr.add("SDT");
        System.out.println("Cac phan tu co trong AppArr là: " + arr);
        ShowList(arr);
        
        System.out.println("***********************");
        
        
        arr.remove("Ngay Sinh");
        System.out.println("Cac phan tu trong AppArr sau khi xoa la: " + arr);
        ShowList(arr);

        System.out.println("***********************");


        arr.set(1,"Nam Sinh");
        System.out.println("Cac phan tu trong AppArr sau khi sua chua: " + arr);
        ShowList(arr);



    }
    public static void ShowList(ArrayList<String> arr) {
        for (String obj : arr) {
            System.out.println("\t" + obj + ",");
        }
        System.out.println();
    }
}

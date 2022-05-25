import java.util.HashSet;
import java.util.Scanner;
public class Hash {
    public static void main(String[] args) throws Exception {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        hashSetString.add("Hoa");
        hashSetString.add("Lan");
        hashSetString.add("Vy");
        hashSetString.add("Thao");
        hashSetString.add("Hanh");
        hashSetString.add("Hoa");

        System.out.println("Cac phan tu trong Hash la: " + hashSetString);
        System.out.println("Nhap cac phan tu can them: ");
        name = sc.nextLine();

        if (hashSetString.contains(name)) {
            System.out.println("Xoa thanh cong!");
            System.out.println("Cac phan tu trong Hash sau khi xoa: " + hashSetString);
        } else {
            System.out.println("Xoa khong thanh cong");
        }

}
}

import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class App88 {
    public static void main(String[] args) throws Exception {

        HashMap <String, String> hashMapCity = new HashMap<>();

        hashMapCity.put("QNg", "Quang Ngai");
        hashMapCity.put("QN", "Quang Nam");

        hashMapCity.put("QNg", "Quang Ninh");
        hashMapCity.put("HCM", "thanh pho Ho Chi Minh");

        System.out.println("Danh sach cac thanh pho trong hashMapCity: ");
        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);

        System.out.println("QNg: " + hashMapCity.get("QNg"));

        System.out.println("NT: " + hashMapCity.get("NT"));

        if (hashMapCity.containsValue("Thanh pho Ho Chi Minh")) {
        System.out.println("Co Thanh pho Ho Chi Minh trong hashMapCity");
        }
    }}

import java.util.Map;
import java.util.LinkedHashMap;
public class App94 {
    public static void main(String[] args) throws Exception {

        LinkedHashMap <Integer, String> hm = new LinkedHashMap<>();

    hm.put(100, "Mo");
    hm.put(101, "Dia");
    hm.put(102, "Chat");
    for(Map.Entry<Integer, String> m:hm.entrySet()) {
    System.out.println(m.getKey()+ " " +m .getValue());
    }
     
    System.out.println("Before invoking remove inthod: " + hm);
    hm.remove(101);
    System.out.println("After invoking remove inthod: " + hm);

}}

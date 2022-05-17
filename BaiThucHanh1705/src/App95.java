import java.util.Set;
import java.util.LinkedHashMap;
public class App95{
    public static void main(String[] args) throws Exception {

        LinkedHashMap <Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        linkedHashMap.put(1,"Java" );
        linkedHashMap.put(3,"C++" );
        linkedHashMap.put(2,"PHP" );
        linkedHashMap.put(4,"Python" );

        System.out.println("Before remove: ");
        show(linkedHashMap);

        linkedHashMap.remove(2);
        System.out.println("After remove: ");
        show(linkedHashMap);

}
        public static void show(LinkedHashMap<Integer, String> linkedHashMap) {
         Set<Integer> keySet = linkedHashMap.keySet();
         for (Integer key : keySet) {
             System.out.println(key + " " + linkedHashMap.get(key));
         }
        }
}

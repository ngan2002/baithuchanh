import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashSetExp1 {
    
    public static void main(String[] args) throws Exception {
        
        Set<String> linkedhashSet = new LinkedHashSet<>();

        linkedhashSet.add("Java");
        linkedhashSet.add("C++");
        linkedhashSet.add("C");
        linkedhashSet.add("PHP");

        for (String str : linkedhashSet) {
            System.out.println(str);
        }

    
}
}


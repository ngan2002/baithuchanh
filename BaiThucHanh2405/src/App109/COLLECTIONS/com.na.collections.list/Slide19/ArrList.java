import java.util.ArrayList;
import java.util.ListIterator;
public class ArrList {
    public static void main(String[] args){
      ArrayList<Character> arrListChar  = new ArrayList<>();
      arrListChar.add('a');
      arrListChar.add('b');
      arrListChar.add('c');
      arrListChar.add('d');
      arrListChar.add('e');

      ListIterator<Character> listIterator = arrListChar.listIterator();
      System.out.println("Cac phan tu co trong arrListChar la: ");
      while (listIterator.hasNext()) {
          System.out.println(listIterator.next() + "\t");
      }
    }
}

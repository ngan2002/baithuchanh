import java.util.LinkedList;

public class Linked {
    public static void main(String[] args){
    LinkedList<String> list = new LinkedList<String>();
    list.add("JAVA");
    list.add("PHP");
    list.add("C#");
    list.add("c++");

    System.out.println("Vi du su dung phuong thuc addA11()");
    System.out.println("********************");
    LinkedList<String> listA = new LinkedList<String>();
    listA.add("PHP");
    System.out.println("listA: ");
    ShowList(listA);


    System.out.println("/nVi du su dung phuong thuc retainA11()");
    System.out.println("********************");
    LinkedList<String> listB = new LinkedList<String>();
    listB.add("Java");
    listA.retainAll(listB);
    System.out.println("listA:");
    ShowList(listA);

    System.out.println("/nVi du su dung phuong thuc removeAll()");
    System.out.println("********************");
    list.removeAll(listB);
    System.out.println("list: "); 
    ShowList(list);

}
public static void ShowList(LinkedList<String> list) {
    for (String obj : list) {
        System.out.println("\t" + obj + ",");
    }
    System.out.println();
}
}
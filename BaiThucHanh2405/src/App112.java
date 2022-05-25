import java.util.LinkedList;
import java.util.Scanner;


public class App112 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    LinkedList<SinhVien> listsv = new LinkedList<SinhVien>();

    SinhVien sv1 = new SinhVien("Dong", 7);
    SinhVien sv2 = new SinhVien("Nam", 6);
    SinhVien sv3 = new SinhVien("Ha", 8);
    SinhVien sv4 = new SinhVien("Nga", 9);

    listsv.add(sv1);
    listsv.add(sv2);
    listsv.add(sv3);
    listsv.add(sv4);   
    
   for(int i=0; i<listsv.size();i ++){
    System.out.println(listsv.get(i));
}
System.out.println("Danh sach sinh vien can phai thi lai la: ");
    for(int i=0; i<listsv.size();i ++){
      if(listsv.get(i).getdiem() <= 5){
        System.out.println("Sinh vien: " + (i+1));
        listsv.get(i).displayStudent();
      }
    }

    System.out.println("Danh sach sinh vien co diem cao nhat la: ");
    int max = listsv.get(0).getdiem();    
    for (int i = 1; i < listsv.size(); i++) {
        if (listsv.get(i).getdiem() > max) {
            max = listsv.get(i).getdiem();
        }
    }
    for(int i=0; i< listsv.size(); i++){
        if(listsv.get(i).getdiem() == max){
          listsv.get(i).displayStudent();
        }
    }

    String  nameForSearch;
    System.out.println("Moi nhap ten sinh vien can tim");
    nameForSearch = scanner.nextLine();
    for(int i = 0; i<listsv.size(); i++){
      if(listsv.get(i).getten().equals(nameForSearch)){
        listsv.get(i).displayStudent();
      }
    }
  }
}
class SinhVien {
  Scanner scanner = new Scanner(System.in);
  private String ten;
  private int diem;
  public SinhVien(){};
  public SinhVien(String ten, int diem) {
      super();
      this.ten = ten;
      this.diem = diem;
  }
  public String getten() {
      return ten;
  }
  public void setten(String ten) {
      this.ten = ten;
  }
  public int getdiem() {
      return diem;
  }
  public void setPoint(int diem) {
      this.diem = diem;
  }
  public void displayStudent(){
    System.out.println("Ten: " + ten);
    System.out.println("Diem: " + diem);
  }
  @Override
  public String toString() {
      return "Student@[Ten sinh vien la " + ten + ", Diem cua sinh vien la" + diem + "]";
  }
}


 
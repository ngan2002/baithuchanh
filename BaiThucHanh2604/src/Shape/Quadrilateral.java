package Shape;
import java.util.Scanner;
public class Quadrilateral extends Point {
    public double x1, y1, x2, y2, x3, y3, x4, y4;
    public double d1, d2, d3, d4;
    public Quadrilateral(String tenDiem, Double x, Double y,Double x1,Double y1, Double x2,Double y2,Double x3,Double y3,Double x4,Double y4,Double d1,Double d2,Double d3,Double d4){
        super(tenDiem, x,y);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.d4 = d4;
        
    }
    public void nhapThongtin() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Moi nhap vao Tung Do diem thu 1: ");
        x1 = sc.nextDouble();
        System.out.println("Moi nhap vao Hoanh Do diem thu 1: ");
        y1 = sc.nextDouble();
        System.out.println("Moi nhap vao Tung Do diem thu 2: ");
        x2 = sc.nextDouble();
        System.out.println("Moi nhap vao Hoanh Do diem thu 2: ");
        y2 = sc.nextDouble();
        System.out.println("Moi nhap vao Tung Do diem thu 3: ");
        x3 = sc.nextDouble();
        System.out.println("Moi nhap vao Hoanh Do diem thu 3: ");
        y3 = sc.nextDouble();
        System.out.println("Moi nhap vao Tung Do diem thu 4: ");
        x4 = sc.nextDouble();
        System.out.println("Moi nhap vao Hoanh Do diem thu 4: ");
        y4 = sc.nextDouble();
       }
       public void tinhDoDai1(){
        d1 = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        
   }
      public void tinhDoDai2() {
       d2 = Math.sqrt((x3 - x2)*(x3 - x2) + (y3 - y2)*(y3 - y2));
   }
      public void tinhDoDai3() {
       d3 = Math.sqrt((x4 - x3)*(x4 - x3) + (y4 - y3)*(y4 - y3));
   }
   public void tinhDoDai4() {
       d4 = Math.sqrt((x4 - x1)*(x4 - x1) + (y4 - y1)*(y4 - y1));
}
public void inThongtin() {
    System.out.println("Do dai khoang cach giua diem thu 1 va thu 2 la: " + d1);
    System.out.println("Do dai khoang cach giua diem thu 2 va thu 3 la: " + d2);
    System.out.println("Do dai khoang cach giua diem thu 3 va thu 4 la: " + d3);
    System.out.println("Do dai khoang cach giua diem thu 1 va thu 4 la: " + d4);

    if(d1 + d2 + d3 > d4 &&  d2 + d3 + d4 > d1 && d1 + d2 + d4 > d3 && d1 + d3 + d4 > d2)
    {
         if (d1==d2 && d2==d3 && d3==d4  ){
                System.out.println("Day la Hinh Vuong");
            } else if(d1==d3 || d2==d4){
            System.out.println("Day la Hinh Chu Nhat");
        }
    } else {
    System.out.println("Bon diem tren khong tao thanh tu giac");
    }

}
}


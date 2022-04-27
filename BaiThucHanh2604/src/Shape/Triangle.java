package Shape;
import java.util.Scanner;
public class Triangle extends Point {
    public double x1, y1, x2, y2, x3, y3;
    public double a, b, c;
    public Triangle(String tenDiem, Double x, Double y,Double x1,Double y1, Double x2,Double y2,Double x3,Double y3,Double a,Double b,Double c){
        super(tenDiem, x, y);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.a = a;
        this.b = b;
        this.c = c;
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
       
    
       }
       public void tinhkhoangcach1(){
         a = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
         
    }
       public void tinhkhoangcach2() {
        b = Math.sqrt((x3 - x2)*(x3 - x2) + (y3 - y2)*(y3 - y2));
    }
       public void tinhkhoangcach3() {
        c = Math.sqrt((x3 - x1)*(x3 - x1) + (y3 - y1)*(y3 - y1));
    }
    
    public void inThongtin() {
        System.out.println("Do dai khoang cach giua diem thu 1 va thu 2 la: " + a);
        System.out.println("Do dai khoang cach giua diem thu 2 va thu 3 la: " + b);
        System.out.println("Do dai khoang cach giua diem thu 1 va thu 3 la: " + c);
        if(a + b > c && b + c > a && c + a > b)
        {
           
            if(a ==b && b ==c)
            {
                System.out.println("Day la tam giac deu");
    
            } else if(a == b || a == c || c == b)
            {
                
              if((a * a + b * b == c * c) || (a * a + c * c == b * b) || (a * a == b * b + c * c))
              {
                  System.out.println("Day la tam giac vuong can");
    
              }else{
                System.out.println("Day la tam giac can");
              }
            }else if((a * a + b * b == c * c) || (a * a + c * c == b * b) || (a * a == b * b + c * c))
            {
                System.out.println("Day la tam giac vuong");
            }else
        {
            System.out.println("Day la tam giac thuong");
        }
    }else{
            System.out.println("Ba diem tren khong tao thanh tam giac");
        }
       }
    }

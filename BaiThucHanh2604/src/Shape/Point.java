package Shape;
import java.util.Scanner;
public class Point {
    
    public String tenDiem;
    public Double x;
    public Double y;

    public Point() {

    }
    public Point(String tenDiem, Double x, Double y) {
        this.tenDiem = tenDiem;
        this.x = x;
        this.y = y;
    }
    public String gettenDiem() {
        return tenDiem;
    }

    public void settenDiem(String tenDiem) {
        this.tenDiem= tenDiem;
    }
    public Double getx() {
        return x;
    }

    public void setx(Double x) {
        this.x = x;
    }
    public Double gety() {
        return y;
    }

    public void sety(Double y) {
        this.y = y;
    }
    
    public void nhapThongtin() {
        System.out.println ("Moi nhap vao Ten Diem: ");
        Scanner sc = new Scanner(System.in);
        tenDiem = sc.nextLine();
        System.out.println("Moi nhap vao Tung Do: ");
        x = sc.nextDouble();
        System.out.println("Moi nhap vao Hoanh Do: ");
        y = sc.nextDouble();
    }
    public void inThongtin() {
        System.out.println("Diem bieu dien tren mat phang Oxy la: " + tenDiem + "(" + x + "," + y + ")");
    }

}

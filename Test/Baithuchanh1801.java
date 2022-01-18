import java.util.Scanner;
class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap he so bac 2, a = ");
        double a = scanner.nextDouble();
        System.out.print("Nhap he so bac 1, b = ");
        double b = scanner.nextDouble();
        System.out.println("Nhap hang so tu do, c = ");
        double c = scanner.nextDouble();
        giaiPTBac2(a, b, c);
    }
    public static void giaiPTBac2(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem!");
            } else {
                System.out.println("Phuong trinh co mot nghiem: " + "x = " + (-c / b));
            }
            return;
        }
        double delta = b*b - 4*a*c;
        double x1;
        double x2;
        if (delta > 0) {
            x1 = (double) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (double) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phuong trinh co hai nghiem la: " + "x1 = " + x1 + " va x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep: " + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem!");
        }
    }
}
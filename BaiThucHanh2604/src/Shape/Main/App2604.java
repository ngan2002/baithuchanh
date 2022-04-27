package Shape.Main;
import java.util.Scanner;

import Shape.Point;
import Shape.Quadrilateral;
import Shape.Triangle;
public class App2604 {
    public static void main(String[] args) throws Exception {

        Point P = new Point();
        P.nhapThongtin();
        P.inThongtin();

        Triangle Tr = new Triangle("A", 2.0, 2.0, -1.0, 5.0 , 3.0, -2.0, -1.0, 5.0, 2.0, 4.0, 6.0);
       
      
        Tr.tinhkhoangcach1();
        Tr.tinhkhoangcach2();
        Tr.tinhkhoangcach2();
        Tr.nhapThongtin();
        Tr.inThongtin();

        Quadrilateral Q = new Quadrilateral("B", 2.0, 3.0, 4.0, 3.0, 1.2, 3.2, 4.2, 3.3, 1.0, 1.5, 7.0, 8.0, 5.0, 4.0);
        Q.tinhDoDai1();
        Q.tinhDoDai2();
        Q.tinhDoDai3();
        Q.nhapThongtin();
        Q.inThongtin();
}
}


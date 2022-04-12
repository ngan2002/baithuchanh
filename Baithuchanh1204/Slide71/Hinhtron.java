package Baithuchanh1204.Slide71;
import java.util.Scanner;
public class Hinhtron {
    private final float PI = 3.14f;
    private float banKinh;
public float getBanKinh() {
    return banKinh;
}
public void setbanKinh(float banKinh) {
    this.banKinh = banKinh;
}
public float tinhChuvi() {
    return 2 * PI * banKinh;
}
public float tinhDienTich() {
    return PI * banKinh * banKinh;
}
}

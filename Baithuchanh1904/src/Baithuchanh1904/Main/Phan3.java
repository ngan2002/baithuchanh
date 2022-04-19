package Baithuchanh1904.Main;
import java.util.Scanner;
import Baithuchanh1904.TaxiCar;
import Baithuchanh1904.Car;
public class Phan3 {
    public static void main(String[] args) throws Exception {
    TaxiCar Tc = new TaxiCar();
    Tc.Move();
    Tc.Reverse();
    Tc.Stop();
    Tc.TurnLeft();
    Tc.TurnRight();

    Car C = new TaxiCar(); 
    C.Move();
    C.Reverse();
    C.Stop();
    C.TurnLeft();
    C.TurnRight();
    
}
}

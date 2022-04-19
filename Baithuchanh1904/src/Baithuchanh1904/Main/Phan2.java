package Baithuchanh1904.Main;
import java.util.Scanner;

import Baithuchanh1904.Animal;
import Baithuchanh1904.Tiger;

public class Phan2 {
    public static void main(String[] args) throws Exception {

        Tiger Tg = new Tiger();
          Tg.eat();
          Tg.roar();
          Tg.run();
          Tg.sleep();
          Tg.walk();

        Animal Al = new Tiger();
        Al.eat();
        Al.roar();
        Al.run();
        Tg.sleep();
        Al.walk();
}
}

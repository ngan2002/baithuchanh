package Baithuchanh1904.Main;
import java.util.Scanner;
import Baithuchanh1904.OnlineStudent;
import Baithuchanh1904.PartTimeEmpoyee;
import Baithuchanh1904.Customer;
import Baithuchanh1904.Employee;
import Baithuchanh1904.FullTImeEmpoyee;
import Baithuchanh1904.OfflineStudent;
import Baithuchanh1904.Person;
import Baithuchanh1904.Student;
import Baithuchanh1904.VIPCustomer;

public class Phan1 {
    public static void main(String[] args) throws Exception {

    Person Ps = new Person();
    Ps.nhapThongtin();
    Ps.hienThiThongTin();

    Student St1 = new Student("Nguyen Thi A", "Ninh Binh", 15, "Nu");
    St1.nhapDiachi();
    St1.nhapSTT();
    St1.hienThiThongTin();

    OfflineStudent Off = new OfflineStudent("Van B", "Gia Lai", 20, "Nam", "Offline");
    Off.hienThiThongTin();

    OnlineStudent Onl = new OnlineStudent("Nga", "Hoa Binh", 21, "Nu", "Online");
    Onl.hienThiThongTin();

    Employee Em = new Employee("Giang", "Nam", 23.0);
    Em.nhaptuoi();
    Em.hienThiThongTin();

    PartTimeEmpoyee Part = new PartTimeEmpoyee(25.0, 12000, "Lam PartTime", "Hoa", "Nu");
    Part.hienThiThongTin();

    FullTImeEmpoyee Full = new FullTImeEmpoyee(27.0, 10000000, "Lam Full Time", "Hien", "Nu");
    Part.hienThiThongTin();

    Customer Ct = new Customer("Nhã", "Nu", 22.0, "Sinh Vien", "Phu Tho");
    Ct.nhaptuoi();
    Ct.nhapNghenghiep();
    Ct.nhapDiachi();
    Ct.hienThiThongTin();

    VIPCustomer VIP = new VIPCustomer(27.0, "Giám đốc", "Khách hàng VIP", "Lan", "Nu", "Hà Nội");
    VIP.hienThiThongTin();

}   
}

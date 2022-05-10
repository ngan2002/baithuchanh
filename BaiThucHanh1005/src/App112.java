import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
public class App112 {
    public static void main(String[] args) {
        LinkedList<String> sinhvien = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        
        String tenSinhVien;
        float diemSinhVien;
        String ThongtinSinhVien;
        String arrThongTin[];
        LinkedList<String> danhSachSV = new LinkedList<>();
         
        
        LinkedList<String> svThiLai = new LinkedList<>();
             
       
        LinkedList<String> svDiemCao = new LinkedList<>();
             
       
        LinkedList<String> svCanTim = new LinkedList<>();
             
        Scanner scanner = new Scanner(System.in);
             
        
        do {
            System.out.println("Moi nhap vao ten sinh vien la: ");
            tenSinhVien = sc.nextLine();
            if (!tenSinhVien.isEmpty()) {
                System.out.println("Nhập vào điểm sinh viên: ");
                diemSinhVien = sc.nextFloat();
                ThongtinSinhVien = tenSinhVien + "\t" + diemSinhVien;
                danhSachSV.add(ThongtinSinhVien);
            }
        } while (!tenSinhVien.isEmpty());   
             
        
        System.out.println("Số sinh viên có trong danh sách = " + (danhSachSV.size()));
        System.out.println("Thông tin của các sinh viên vừa nhập là: ");
        System.out.println("Tên sinh viên\t Điểm");

        Iterator <String> iterator = danhSachSV.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
             
        for (int i = 0; i < danhSachSV.size(); i++) {
            
            String sv = danhSachSV.get(i);  
     
            
            arrThongTin = sv.split("\t");
                 
           
            double point = Double.parseDouble(arrThongTin[1]);
            if (point <= 5) {
                svThiLai.add(sv);
            }
        }
                 
        if (svThiLai.isEmpty()) {
            System.out.println("Không có sinh viên phải thi lại!");
        } else {
            System.out.println("Số sinh viên phải thi lại = " + (svThiLai.size()));
            System.out.println("Thông tin của các sinh viên phải thi lại là: ");
            System.out.println("Tên sinh viên\t Điểm");
            iterator = svThiLai.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
             
        double maxTemp = 0;
        int i = 0;  
             
        
        while (i < danhSachSV.size()) {
            arrThongTin = danhSachSV.get(i).split("\t");
            if (Double.parseDouble(arrThongTin[1]) >= maxTemp) {
                maxTemp = Double.parseDouble(arrThongTin[1]);
            }
            i++;
        }
     
        i = 0;
        while (i < danhSachSV.size()) {
            arrThongTin = danhSachSV.get(i).split("\t");
            
            if (Double.parseDouble(arrThongTin[1]) == maxTemp) {
                svDiemCao.add(danhSachSV.get(i));
            }
            i++;
        }
             
        System.out.println("Thông tin của các sinh viên có điểm cao nhất là: ");
        System.out.println("Tên sinh viên\t Điểm");
        iterator = svDiemCao.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
             
       
        System.out.println("Nhập tên sinh viên cần tìm: ");
        String search = scanner.nextLine();
             
        i = 0;
        while (i < danhSachSV.size()) {
            arrThongTin = danhSachSV.get(i).split("\t");
            tenSinhVien = arrThongTin[0];
                 
            
            if (search.equalsIgnoreCase(tenSinhVien)) {
                svCanTim.add(danhSachSV.get(i));
            }
                 
            i++;    
        }
             
        System.out.println("Thông tin của các sinh viên tên là " + search + ": ");
        System.out.println("Tên sinh viên\t Điểm");
        iterator = svCanTim.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

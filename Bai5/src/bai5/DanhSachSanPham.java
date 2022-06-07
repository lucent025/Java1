package bai5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.util.Scanner;

public class DanhSachSanPham {
    
    private static ArrayList<SanPham> danhSach = new ArrayList<>();

    public static void nhap() {
        Scanner scanner = new Scanner(System.in);
        do {            
            System.out.print("Nhap ten san pham: ");
            String tenSp = scanner.nextLine();
            
            if (tenSp == null || "".equals(tenSp)) {
                break;
            }
            
            System.out.print("Nhap gia san pham: ");
            double giaSp = scanner.nextDouble();
            
            SanPham sp = new SanPham(tenSp, giaSp);
            danhSach.add(sp);
            scanner.nextLine();
        } while (true);
    }

    public static void xuat() {
        for(SanPham sanPham : danhSach) {
            System.out.printf("%s   %.2f\n", sanPham.getTenSp(), sanPham.getGiaSp());
        }
    }
    
    public static void sapXep() {
        Collections.sort(danhSach, giamDanTheoGia);
    }
    
    static Comparator<SanPham> giamDanTheoGia = new Comparator<SanPham>() {
        @Override
        public int compare(SanPham o1, SanPham o2) {
            return Double.compare(o2.getGiaSp(), o1.getGiaSp());
        }
    };
    
    public static void giaTrungBinh() {
        double tongGia= 0;
        for(SanPham sp : danhSach) {
            tongGia += sp.getGiaSp();
        }
        double giaTb = tongGia/danhSach.size();
        System.out.println("Gia trung binh san pham: " + giaTb);
    }

    public static void xoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten can tim va xoa: ");
        
        String find = scanner.nextLine();
        SanPham found = null;
        
        for (SanPham sp : danhSach) {
            if (sp.getTenSp().equalsIgnoreCase(find)) {
                found = sp;
                break;
            }
        }
        danhSach.remove(found);
    }

    public void menu() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("|    1. Nhap. \n");
        System.out.print("|    2. Xuat.\n");
        System.out.print("|    3. Sap xep.\n");
        System.out.print("|    4. Gia trung binh.\n");
        System.out.print("|    5. Xoa.\n");
        System.out.print("|    6. Ket thuc chuong trinh.\n");
        System.out.print("Nhap lua chon: ");

        int luachon = scanner.nextInt();
        switch (luachon) {
            case 1:
                nhap();
                this.end();
                break;
            case 2:
                xuat();
                this.end();
                break;
            case 3:
                sapXep();
                this.end();
                break;
            case 4:
                giaTrungBinh();
                this.end();
                break;
            case 5:
                xoa();
                this.end();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.print("####################################\n");
                System.out.print("#                                                                                     #\n");
                System.out.print("#                 Nhap sai, xin hay nhap lai!                             #\n");
                System.out.print("#                                                                                     #\n");
                System.out.print("####################################\n");
                this.menu();
        }
    }

    public void end() {
        System.out.print("+--------------------------------------------------+\n");
        System.out.print("|                                                             |\n");
        System.out.print("|    Ban co muon tiep tuc chuong trinh?    |\n");
        System.out.print("|         1. Tiep tuc.      2.Thoat.                 |\n");
        System.out.print("|                                                             |\n");
        System.out.print("+--------------------------------------------------+\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap lua chon: ");
        int YoN = scanner.nextInt();

        switch (YoN) {
            case 1:
                this.menu();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.print("####################################\n");
                System.out.print("#                                                                                     #\n");
                System.out.print("#                 Nhap sai, xin hay nhap lai!                             #\n");
                System.out.print("#                                                                                     #\n");
                System.out.print("####################################\n");
                this.end();
        }
    }
}

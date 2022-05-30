package assignment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        DsNhanVien ds = new DsNhanVien();

        do {
            System.out.println("\nMenu chuong trinh:");
            System.out.println("1. Nhap danh sach nhan vien tu ban phim.");
            System.out.println("2. Xuat danh sach nhan vien ra man hinh");
            System.out.println("3. Tim và hien thi nhan vien theo ma nhap tu ban phim.");
            System.out.println("4. Xoa nhan vien theo ma nhap tu ban phim.");
            System.out.println("5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim.");
            System.out.println("6. Tim cac nhan vien theo khoang luong nhap tu ban phim.");
            System.out.println("7. Sap xep nhan vien theo ho va ten.");
            System.out.println("8. Sap xep nhan vien theo thu nhap.");
            System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat.");
            System.out.println("10. Ket thuc chuong trinh.");
            System.out.println("Nhap [0-9]");

            System.out.print("Hay nhap lua chon: ");
            int opt = scanner.nextInt();
            switch (opt) {
                case 1 -> {
                    ds.nhapThongTin();
                    break;
                }
                case 2 -> {
                    ds.xuatThongTin();
                    break;
                }
                case 3 -> {
                    //Chuc nang 3
                    break;
                }
                case 4 -> {
                    //Chuc nang 4
                    break;
                }
                case 5 -> {
                    //Chuc nang 5
                    break;
                }
                case 6 -> {
                    //Chuc nang 6
                    break;
                }
                case 7 -> {
                    //Chuc nang 7
                    break;
                }
                case 8 -> {
                    //Chuc nang 8
                    break;
                }
                case 9 -> {
                    //Chuc nang 9
                    break;
                }
                case 10 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.print("    Nhap sai, xin hay nhap lai!   \n");
                    continue;
                }
            }
        } while (true);
    }
}

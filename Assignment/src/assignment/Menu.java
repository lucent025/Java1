package assignment;

import java.util.Scanner;

public class Menu {

    void menu() {
        System.out.println("1. Nhap danh sach nhan vien tu ban phim.");
        System.out.println("2. Xuat danh sach nhan vien ra man hinh");
        System.out.println("3. Tim và hien thi nhan vien theo ma nhap tu ban phim.");
        System.out.println("4. Xoa nhan vien theo ma nhap tu ban phim.");
        System.out.println("5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim.");
        System.out.println("6. Tim cac nhan vien theo ma nhap tu ban phim.");
        System.out.println("7. Sap xep nhan vien theo ho va ten.");
        System.out.println("8. Sap xep nhan vien theo thu nhap.");
        System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat.");
        System.out.println("10. Ket thuc chuong trinh.");
        System.out.println("Nhap [0-9]");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hay nhap lua chon: ");
        int opt = scanner.nextInt();

        switch (opt) {
            case 1 -> {
                //Chuc nang 1
                end();
                break;
            }
            case 2 -> {
                //Chuc nang 2
                end();
                break;
            }
            case 3 -> {
                //Chuc nang 3
                end();
                break;
            }
            case 4 -> {
                //Chuc nang 4
                end();
                break;
            }
            case 5 -> {
                //Chuc nang 5
                end();
                break;
            }
            case 6 -> {
                //Chuc nang 6
                end();
                break;
            }
            case 7 -> {
                //Chuc nang 7
                end();
                break;
            }
            case 8 -> {
                //Chuc nang 8
                end();
                break;
            }
            case 9 -> {
                //Chuc nang 9
                end();
                break;
            }
            case 10 -> {
                System.exit(0);
            }
            default -> {
                System.out.print("    Nhap sai, xin hay nhap lai!   \n");
                menu();
            }
        }

    }

    public static void end() {
        System.out.print("    Ban co muon tiep tuc chuong trinh?\n");
        System.out.print("         1. Tiep tuc.      2.Thoat.     \n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap lua chon: ");
        int YoN = scanner.nextInt();
        Menu menu = new Menu();
        switch (YoN) {
            case 1 ->
                menu.menu();
            case 2 ->
                System.exit(0);
            default -> {
                System.out.print("    Nhap sai, xin hay nhap lai!   \n");
                end();
            }
        }
    }
}

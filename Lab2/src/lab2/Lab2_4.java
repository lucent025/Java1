package lab2;

import java.util.Scanner;

public class Lab2_4 {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Lab2_1 b1 = new Lab2_1();
        Lab2_2 b2 = new Lab2_2();
        Lab2_3 b3 = new Lab2_3();

        System.out.print("+----------------------------------------+\n");
        System.out.print("|                                        |\n");
        System.out.print("|    1. Xem ngay thang.                  |\n");
        System.out.print("|    2. Kiem tra tam giac.               |\n");
        System.out.print("|    3. Tinh tien taxi.                  |\n");
        System.out.print("|    4. Ket thuc chuong trinh.           |\n");
        System.out.print("|                                        |\n");
        System.out.print("+----------------------------------------+\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hay nhap lua chon: ");
        int opt = scanner.nextInt();

        switch (opt) {
            case 1:
                b1.datetime();
                end();
                break;
            case 2:
                b2.tamGiac();
                end();
                break;
            case 3:
                b3.tienTaxi();
                end();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.print("####################################\n");
                System.out.print("#                                  #\n");
                System.out.print("#    Nhap sai, xin hay nhap lai!   #\n");
                System.out.print("#                                  #\n");
                System.out.print("####################################\n");
                menu();
        }

    }

    public static void end() {
        System.out.print("+----------------------------------------+\n");
        System.out.print("|                                        |\n");
        System.out.print("|    Ban co muon tiep tuc chuong trinh?  |\n");
        System.out.print("|         1. Tiep tuc.      2.Thoat.     |\n");
        System.out.print("|                                        |\n");
        System.out.print("+----------------------------------------+\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap lua chon: ");
        int YoN = scanner.nextInt();

        switch (YoN) {
            case 1 ->
                menu();
            case 2 ->
                System.exit(0);
            default -> {
                System.out.print("####################################\n");
                System.out.print("#                                  #\n");
                System.out.print("#    Nhap sai, xin hay nhap lai!   #\n");
                System.out.print("#                                  #\n");
                System.out.print("####################################\n");
                end();
            }
        }
    }
}

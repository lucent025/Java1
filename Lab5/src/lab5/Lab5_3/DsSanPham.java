/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5.Lab5_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DsSanPham {

    private ArrayList<SanPham> list = new ArrayList<>();

    public void nhap() {
        System.out.println("Nhap danh sach san pham: ");
        Scanner input = new Scanner(System.in);

        int i = 1;
        do {
            System.out.printf("Nhap ten san pham thu %d: ", i);
            String temptenSP = input.nextLine();

            if (temptenSP == null || "".equals(temptenSP)) {
                break;
            }

            System.out.printf("Nhap gia san pham thu %d: ", i);
            int tempgiaSP = input.nextInt();

            list.add(new SanPham(temptenSP, tempgiaSP));
            input.nextLine();
            i++;

        } while (true);
    }

    public void xuat() {
        System.out.printf("\t\tDanh sach san pham\n");
        System.out.println("Ten\t\t\s|Gia\t\t");
        for (SanPham sanPham : list) {
            System.out.printf("%s\t\t | %d VND\n", sanPham.getTenSP(), sanPham.getGiaSP());
        }
    }

    public void sapxep() {
        Collections.sort(list, (a, b) -> (a.getGiaSP() - b.getGiaSP()));
        Collections.reverse(list);
        System.out.println("\nSan pham sau khi sap xep:");
        this.xuat();
    }

    public void xoa() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhap ten san pham muon xoa: ");
        String tentimkiem = input.nextLine();
        SanPham found = null;

        for (SanPham sanPham : list) {
            if (sanPham.getTenSP().equalsIgnoreCase(tentimkiem)) {
                found = sanPham;
                break;
            }
        }
        if (found != null) {
            list.remove(found);
        }
    }

    public void trungbinhgia() {
        double tb, sum = 0;

        for (SanPham sanPham : list) {
            sum += sanPham.getGiaSP();
        }
        tb = sum / list.size();
        System.out.printf("Gia tb: %.2f VND\n", tb);
    }
    
    public void menu() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("+----------------------------------------+\n");
        System.out.print("|                                        |\n");
        System.out.print("|    1. Nhap.                            |\n");
        System.out.print("|    2. Xuat.                            |\n");
        System.out.print("|    3. Sap xep.                         |\n");
        System.out.print("|    4. Gia trung binh.                  |\n");
        System.out.print("|    5. Xoa.                             |\n");
        System.out.print("|    6. Ket thuc chuong trinh.           |\n");
        System.out.print("|                                        |\n");
        System.out.print("+----------------------------------------+\n");
        System.out.print("Nhap lua chon: ");

        int luachon = scanner.nextInt();
        switch (luachon) {
            case 1:
                this.nhap();
                this.end();
                break;
            case 2:
                this.xuat();
                this.end();
                break;
            case 3:
                this.sapxep();
                this.end();
                break;
            case 4:
                this.trungbinhgia();
                this.end();
                break;
            case 5:
                this.xoa();
                this.end();
                break;
            case 6:
                System.exit(0);
            default:
                System.out.print("####################################\n");
                System.out.print("#                                  #\n");
                System.out.print("#    Nhap sai, xin hay nhap lai!   #\n");
                System.out.print("#                                  #\n");
                System.out.print("####################################\n");
                this.menu();
        }
    }

    public void end() {
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
            case 1:
                this.menu();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.print("####################################\n");
                System.out.print("#                                  #\n");
                System.out.print("#    Nhap sai, xin hay nhap lai!   #\n");
                System.out.print("#                                  #\n");
                System.out.print("####################################\n");
                this.end();
        }
    }
}

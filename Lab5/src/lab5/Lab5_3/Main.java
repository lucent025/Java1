/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5.Lab5_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DsSanPham danhsach = new DsSanPham();

        danhsach.menu();

    }
    //Bai1
//    public static void mangList() {
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Double> sothuc = new ArrayList<Double>();
//        System.out.print("Nhap so: ");
//        try {
//            while(true){
//            double nhapso = scanner.nextDouble();
//            sothuc.add(nhapso);
//            
//            System.out.print("Nhap them (/N)?");
//            if(scanner.nextLine().equals("N"));
//            }
//        } catch(Exception e){
//            double sum = 0;
//            for(Double x : sothuc){
//                System.out.println(x);
//                sum += x;
//            }
//            System.out.printf("Tong la: %.2f\n",sum);
//         }        
//    }
    
    //Bai2
//    static ArrayList name = new ArrayList<String>();
//    static Scanner scanner = new Scanner(System.in);
//    static void menu() {
//        System.out.print("+----------------------------------------+\n");
//        System.out.print("|                                        |\n");
//        System.out.print("|    1. Nhap.                            |\n");
//        System.out.print("|    2. Xuat.                            |\n");
//        System.out.print("|    3. Sap xep.                         |\n");
//        System.out.print("|    4. Xao tron.                        |\n");
//        System.out.print("|    5. Xoa.                             |\n");
//        System.out.print("|    6. Ket thuc chuong trinh.           |\n");
//        System.out.print("|                                        |\n");
//        System.out.print("+----------------------------------------+\n");
//        System.out.print("Nhap lua chon: ");
//
//        int luachon = scanner.nextInt();
//        switch (luachon) {
//            case 1:
//                String ten = scanner.nextLine();
//                System.out.print("Nhap ten: ");
//                nhap(ten);
//                menu();
//                break;
//            case 2:
//                xuat();
//                menu();
//                break;
//            case 3:
//                sapxep();
//                menu();
//                break;
//            case 4:
//                ngaunhien();
//                menu();
//                break;
//            case 5:
//                xoa();
//                menu();
//                break;
//            case 6:
//                System.exit(0);
//            default:
//                System.out.print("####################################\n");
//                System.out.print("#                                  #\n");
//                System.out.print("#    Nhap sai, xin hay nhap lai!   #\n");
//                System.out.print("#                                  #\n");
//                System.out.print("####################################\n");
//                menu();
//        }
//
//    }
//
//    static ArrayList nhap(String nhapten) {
//        while (true) {
//            nhapten = scanner.nextLine();
//            name.add(nhapten);
//
//            System.out.print("Nhap them (Y/N)? ");
//            if (scanner.nextLine().equalsIgnoreCase("n")) {
//                break;
//            } else {
//                System.out.print("Nhap ten: ");
//            }
//        }
//        return name;
//    }
//
//    static void xuat() {
//
//        System.out.println(name);
//        for (var x : name) {
//            System.out.println(x);
//        }
//
//    }
//
//    static void sapxep() {
//
//        Collections.sort(name);
//        Collections.reverse(name);
//        System.out.println(name);
//        for (var x : name) {
//            System.out.println(x);
//        }
//
//    }
//
//    static void ngaunhien() {
//
//        Collections.shuffle(name);
//        System.out.println(name);
//        for (var x : name) {
//            System.out.println(x);
//        }
//
//    }
//
//    static void xoa() {
//
//        for (var x : name) {
//            System.out.printf("%d. %s\n", name.indexOf(x), x);
//        }
//        System.out.print("Nhap so thu tu ten muon xoa: ");
//        int stt = scanner.nextInt();
//        name.remove(stt);
//        System.out.println(name);
//        for (var x : name) {
//            System.out.println(x);
//        }
//
//    }
    

}
